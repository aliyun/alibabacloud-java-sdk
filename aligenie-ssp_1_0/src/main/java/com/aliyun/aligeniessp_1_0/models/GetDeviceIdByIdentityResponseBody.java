// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetDeviceIdByIdentityResponseBodyResult result;

    public static GetDeviceIdByIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdByIdentityResponseBody self = new GetDeviceIdByIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdByIdentityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceIdByIdentityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceIdByIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceIdByIdentityResponseBody setResult(GetDeviceIdByIdentityResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeviceIdByIdentityResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds extends TeaModel {
        @NameInMap("DeviceUnionId")
        public String deviceUnionId;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds self = new GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds();
            return TeaModel.build(map, self);
        }

        public GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds setDeviceUnionId(String deviceUnionId) {
            this.deviceUnionId = deviceUnionId;
            return this;
        }
        public String getDeviceUnionId() {
            return this.deviceUnionId;
        }

        public GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetDeviceIdByIdentityResponseBodyResult extends TeaModel {
        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        @NameInMap("DeviceUnionIds")
        public java.util.List<GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds> deviceUnionIds;

        public static GetDeviceIdByIdentityResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceIdByIdentityResponseBodyResult self = new GetDeviceIdByIdentityResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeviceIdByIdentityResponseBodyResult setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public GetDeviceIdByIdentityResponseBodyResult setDeviceUnionIds(java.util.List<GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds> deviceUnionIds) {
            this.deviceUnionIds = deviceUnionIds;
            return this;
        }
        public java.util.List<GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds> getDeviceUnionIds() {
            return this.deviceUnionIds;
        }

    }

}
