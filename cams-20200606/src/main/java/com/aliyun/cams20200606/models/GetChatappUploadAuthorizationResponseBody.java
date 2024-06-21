// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappUploadAuthorizationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <ul>
     * <li>A value of OK indicates that the call is successful.</li>
     * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetChatappUploadAuthorizationResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatappUploadAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatappUploadAuthorizationResponseBody self = new GetChatappUploadAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatappUploadAuthorizationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The AccessKey ID that is used to authorize a user to upload a file to Object Storage Service (OSS).</p>
         * 
         * <strong>example:</strong>
         * <p>2skeuurfj****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret that is used to authorize a user to upload a file to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>skdkdukeuuuu****</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The name of the bucket to which a file is uploaded in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The directory to which a file is uploaded in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>1000102939</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <p>The address of the OSS server to which a file is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss.com">https://oss.com</a></p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <p>The timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Expire")
        public Integer expire;

        /**
         * <p>The security token.</p>
         * 
         * <strong>example:</strong>
         * <p>dkdieiii**</p>
         */
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
