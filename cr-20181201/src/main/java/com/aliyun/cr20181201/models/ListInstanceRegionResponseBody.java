// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("Regions")
    public java.util.List<ListInstanceRegionResponseBodyRegions> regions;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRegionResponseBody self = new ListInstanceRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceRegionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceRegionResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListInstanceRegionResponseBody setRegions(java.util.List<ListInstanceRegionResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListInstanceRegionResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListInstanceRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceRegionResponseBodyRegions extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RegionId")
        public String regionId;

        public static ListInstanceRegionResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRegionResponseBodyRegions self = new ListInstanceRegionResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListInstanceRegionResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListInstanceRegionResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
