// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class GetRootBusinessLocationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Locations")
    public GetRootBusinessLocationsResponseBodyLocations locations;

    @NameInMap("Success")
    public Boolean success;

    public static GetRootBusinessLocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRootBusinessLocationsResponseBody self = new GetRootBusinessLocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRootBusinessLocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRootBusinessLocationsResponseBody setLocations(GetRootBusinessLocationsResponseBodyLocations locations) {
        this.locations = locations;
        return this;
    }
    public GetRootBusinessLocationsResponseBodyLocations getLocations() {
        return this.locations;
    }

    public GetRootBusinessLocationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRootBusinessLocationsResponseBodyLocations extends TeaModel {
        @NameInMap("Location")
        public java.util.List<String> location;

        public static GetRootBusinessLocationsResponseBodyLocations build(java.util.Map<String, ?> map) throws Exception {
            GetRootBusinessLocationsResponseBodyLocations self = new GetRootBusinessLocationsResponseBodyLocations();
            return TeaModel.build(map, self);
        }

        public GetRootBusinessLocationsResponseBodyLocations setLocation(java.util.List<String> location) {
            this.location = location;
            return this;
        }
        public java.util.List<String> getLocation() {
            return this.location;
        }

    }

}
