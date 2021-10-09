// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestOssStsResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public RequestOssStsResponseBodyData data;

    public static RequestOssStsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestOssStsResponseBody self = new RequestOssStsResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestOssStsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestOssStsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestOssStsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RequestOssStsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestOssStsResponseBody setData(RequestOssStsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestOssStsResponseBodyData getData() {
        return this.data;
    }

    public static class RequestOssStsResponseBodyData extends TeaModel {
        @NameInMap("ObjectKeyPrefix")
        public String objectKeyPrefix;

        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("Bucket")
        public String bucket;

        public static RequestOssStsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestOssStsResponseBodyData self = new RequestOssStsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestOssStsResponseBodyData setObjectKeyPrefix(String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }
        public String getObjectKeyPrefix() {
            return this.objectKeyPrefix;
        }

        public RequestOssStsResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public RequestOssStsResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public RequestOssStsResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public RequestOssStsResponseBodyData setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public RequestOssStsResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public RequestOssStsResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

}
