// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestBindingStateResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public RequestBindingStateResponseBodyData data;

    public static RequestBindingStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestBindingStateResponseBody self = new RequestBindingStateResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestBindingStateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestBindingStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestBindingStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RequestBindingStateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestBindingStateResponseBody setData(RequestBindingStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestBindingStateResponseBodyData getData() {
        return this.data;
    }

    public static class RequestBindingStateResponseBodyData extends TeaModel {
        @NameInMap("UserAvatar")
        public String userAvatar;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("UserSource")
        public String userSource;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("BindAt")
        public Long bindAt;

        @NameInMap("UserNick")
        public String userNick;

        public static RequestBindingStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestBindingStateResponseBodyData self = new RequestBindingStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestBindingStateResponseBodyData setUserAvatar(String userAvatar) {
            this.userAvatar = userAvatar;
            return this;
        }
        public String getUserAvatar() {
            return this.userAvatar;
        }

        public RequestBindingStateResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public RequestBindingStateResponseBodyData setUserSource(String userSource) {
            this.userSource = userSource;
            return this;
        }
        public String getUserSource() {
            return this.userSource;
        }

        public RequestBindingStateResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public RequestBindingStateResponseBodyData setBindAt(Long bindAt) {
            this.bindAt = bindAt;
            return this;
        }
        public Long getBindAt() {
            return this.bindAt;
        }

        public RequestBindingStateResponseBodyData setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}
