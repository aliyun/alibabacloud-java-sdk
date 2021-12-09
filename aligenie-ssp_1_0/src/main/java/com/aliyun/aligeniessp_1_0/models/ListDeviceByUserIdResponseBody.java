// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdResponseBody extends TeaModel {
    // 返回的错误码
    @NameInMap("Code")
    public Integer code;

    // 返回的错误信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 返回result
    @NameInMap("Result")
    public java.util.List<ListDeviceByUserIdResponseBodyResult> result;

    public static ListDeviceByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdResponseBody self = new ListDeviceByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeviceByUserIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceByUserIdResponseBody setResult(java.util.List<ListDeviceByUserIdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDeviceByUserIdResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDeviceByUserIdResponseBodyResultDeviceUnionIds extends TeaModel {
        // 组织id对应的归一id
        @NameInMap("DeviceUnionId")
        public String deviceUnionId;

        // 组织id
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListDeviceByUserIdResponseBodyResultDeviceUnionIds build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceByUserIdResponseBodyResultDeviceUnionIds self = new ListDeviceByUserIdResponseBodyResultDeviceUnionIds();
            return TeaModel.build(map, self);
        }

        public ListDeviceByUserIdResponseBodyResultDeviceUnionIds setDeviceUnionId(String deviceUnionId) {
            this.deviceUnionId = deviceUnionId;
            return this;
        }
        public String getDeviceUnionId() {
            return this.deviceUnionId;
        }

        public ListDeviceByUserIdResponseBodyResultDeviceUnionIds setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListDeviceByUserIdResponseBodyResult extends TeaModel {
        // 设备信息对应的openId
        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        // 组织id及归一id列表
        @NameInMap("DeviceUnionIds")
        public java.util.List<ListDeviceByUserIdResponseBodyResultDeviceUnionIds> deviceUnionIds;

        public static ListDeviceByUserIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceByUserIdResponseBodyResult self = new ListDeviceByUserIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDeviceByUserIdResponseBodyResult setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public ListDeviceByUserIdResponseBodyResult setDeviceUnionIds(java.util.List<ListDeviceByUserIdResponseBodyResultDeviceUnionIds> deviceUnionIds) {
            this.deviceUnionIds = deviceUnionIds;
            return this;
        }
        public java.util.List<ListDeviceByUserIdResponseBodyResultDeviceUnionIds> getDeviceUnionIds() {
            return this.deviceUnionIds;
        }

    }

}
