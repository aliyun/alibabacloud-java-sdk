// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityResponseBody extends TeaModel {
    // 返回的错误信息
    @NameInMap("Message")
    public String message;

    // 返回的错误码
    @NameInMap("Code")
    public Integer code;

    // 返回result
    @NameInMap("Result")
    public GetDeviceIdByIdentityResponseBodyResult result;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceIdByIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdByIdentityResponseBody self = new GetDeviceIdByIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdByIdentityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceIdByIdentityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceIdByIdentityResponseBody setResult(GetDeviceIdByIdentityResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeviceIdByIdentityResponseBodyResult getResult() {
        return this.result;
    }

    public GetDeviceIdByIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds extends TeaModel {
        // 组织id，
        @NameInMap("OrganizationId")
        public String organizationId;

        // 组织id对应的归一id
        @NameInMap("DeviceUnionId")
        public String deviceUnionId;

        public static GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds self = new GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds();
            return TeaModel.build(map, self);
        }

        public GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetDeviceIdByIdentityResponseBodyResultDeviceUnionIds setDeviceUnionId(String deviceUnionId) {
            this.deviceUnionId = deviceUnionId;
            return this;
        }
        public String getDeviceUnionId() {
            return this.deviceUnionId;
        }

    }

    public static class GetDeviceIdByIdentityResponseBodyResult extends TeaModel {
        // 设备信息对应的openId
        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        // 组织id及归一id列表
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
