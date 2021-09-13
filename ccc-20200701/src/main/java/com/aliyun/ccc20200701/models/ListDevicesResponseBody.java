// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("Data")
    public java.util.List<ListDevicesResponseBodyData> data;

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

    public ListDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListDevicesResponseBody setData(java.util.List<ListDevicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDevicesResponseBodyData> getData() {
        return this.data;
    }

    public static class ListDevicesResponseBodyData extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("Expires")
        public Long expires;

        @NameInMap("Contact")
        public String contact;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ListDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyData self = new ListDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListDevicesResponseBodyData setExpires(Long expires) {
            this.expires = expires;
            return this;
        }
        public Long getExpires() {
            return this.expires;
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

        public ListDevicesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListDevicesResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListDevicesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
