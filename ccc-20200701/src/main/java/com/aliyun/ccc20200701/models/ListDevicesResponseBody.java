// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDevicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListDevicesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponseBody self = new ListDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDevicesResponseBody setData(java.util.List<ListDevicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDevicesResponseBodyData> getData() {
        return this.data;
    }

    public ListDevicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDevicesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDevicesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d7b818c3-8d3a-732f-bc9e-1782wa16****</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>sip:8032****@33.89.XX.XX:64189;transport=tcp;registering_acc=18_134_23_4</p>
         */
        @NameInMap("Contact")
        public String contact;

        /**
         * <strong>example:</strong>
         * <p>ACC-YUNBS-1.0.10-****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>1609118499750</p>
         */
        @NameInMap("Expires")
        public Long expires;

        /**
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyData self = new ListDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListDevicesResponseBodyData setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public ListDevicesResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListDevicesResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDevicesResponseBodyData setExpires(Long expires) {
            this.expires = expires;
            return this;
        }
        public Long getExpires() {
            return this.expires;
        }

        public ListDevicesResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListDevicesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDevicesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
