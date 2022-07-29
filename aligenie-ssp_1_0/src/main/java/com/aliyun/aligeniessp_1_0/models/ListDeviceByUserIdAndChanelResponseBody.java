// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdAndChanelResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDeviceByUserIdAndChanelResponseBodyResult> result;

    public static ListDeviceByUserIdAndChanelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdAndChanelResponseBody self = new ListDeviceByUserIdAndChanelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdAndChanelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeviceByUserIdAndChanelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceByUserIdAndChanelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceByUserIdAndChanelResponseBody setResult(java.util.List<ListDeviceByUserIdAndChanelResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDeviceByUserIdAndChanelResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds extends TeaModel {
        @NameInMap("DeviceUnionId")
        public String deviceUnionId;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds self = new ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds();
            return TeaModel.build(map, self);
        }

        public ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds setDeviceUnionId(String deviceUnionId) {
            this.deviceUnionId = deviceUnionId;
            return this;
        }
        public String getDeviceUnionId() {
            return this.deviceUnionId;
        }

        public ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListDeviceByUserIdAndChanelResponseBodyResult extends TeaModel {
        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        @NameInMap("DeviceUnionIds")
        public java.util.List<ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds> deviceUnionIds;

        public static ListDeviceByUserIdAndChanelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceByUserIdAndChanelResponseBodyResult self = new ListDeviceByUserIdAndChanelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDeviceByUserIdAndChanelResponseBodyResult setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public ListDeviceByUserIdAndChanelResponseBodyResult setDeviceUnionIds(java.util.List<ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds> deviceUnionIds) {
            this.deviceUnionIds = deviceUnionIds;
            return this;
        }
        public java.util.List<ListDeviceByUserIdAndChanelResponseBodyResultDeviceUnionIds> getDeviceUnionIds() {
            return this.deviceUnionIds;
        }

    }

}
