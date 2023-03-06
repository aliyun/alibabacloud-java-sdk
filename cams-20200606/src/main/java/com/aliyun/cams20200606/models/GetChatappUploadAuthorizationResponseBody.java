// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappUploadAuthorizationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetChatappUploadAuthorizationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetChatappUploadAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatappUploadAuthorizationResponseBody self = new GetChatappUploadAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatappUploadAuthorizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatappUploadAuthorizationResponseBody setData(GetChatappUploadAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChatappUploadAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public GetChatappUploadAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatappUploadAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatappUploadAuthorizationResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("Expire")
        public Integer expire;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetChatappUploadAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatappUploadAuthorizationResponseBodyData self = new GetChatappUploadAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatappUploadAuthorizationResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetChatappUploadAuthorizationResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetChatappUploadAuthorizationResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetChatappUploadAuthorizationResponseBodyData setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetChatappUploadAuthorizationResponseBodyData setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public GetChatappUploadAuthorizationResponseBodyData setExpire(Integer expire) {
            this.expire = expire;
            return this;
        }
        public Integer getExpire() {
            return this.expire;
        }

        public GetChatappUploadAuthorizationResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
