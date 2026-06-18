// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAudioNoteUploadUrlResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access is denied.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAudioNoteUploadUrlResponseBodyData data;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE339D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAudioNoteUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudioNoteUploadUrlResponseBody self = new GetAudioNoteUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudioNoteUploadUrlResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAudioNoteUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAudioNoteUploadUrlResponseBody setData(GetAudioNoteUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAudioNoteUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAudioNoteUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAudioNoteUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioNoteUploadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAudioNoteUploadUrlResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKey ID used for signing.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NYMxfDw3GkXfvEmZHXXXXXX</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The expiration time of the authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-13T12:19:13Z</p>
         */
        @NameInMap("Expire")
        public String expire;

        /**
         * <p>The storage path of the OSS file.</p>
         * 
         * <strong>example:</strong>
         * <p>audio/file/sample1</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The host address.</p>
         * 
         * <strong>example:</strong>
         * <p>//alicom-voice-ai-agent-xxxx.oss-cn-xxxx.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The key of the OSS file.</p>
         * 
         * <strong>example:</strong>
         * <p>audio/file/sample1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The maximum file size.</p>
         * 
         * <strong>example:</strong>
         * <p>2560000</p>
         */
        @NameInMap("MaxFileSize")
        public Long maxFileSize;

        /**
         * <p>The HTTP method used for upload.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The upload policy.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The authorization licensing key.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The signature of the temporary upload credential, used to verify legitimacy during upload.</p>
         * 
         * <strong>example:</strong>
         * <p>oss sig text</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The upload URL.</p>
         * 
         * <strong>example:</strong>
         * <p>//alicom-voice-ai-agent-xxxx.oss-cn-xxxx.aliyuncs.com</p>
         */
        @NameInMap("UploadUrl")
        public String uploadUrl;

        public static GetAudioNoteUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioNoteUploadUrlResponseBodyData self = new GetAudioNoteUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAudioNoteUploadUrlResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetAudioNoteUploadUrlResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetAudioNoteUploadUrlResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetAudioNoteUploadUrlResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetAudioNoteUploadUrlResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAudioNoteUploadUrlResponseBodyData setMaxFileSize(Long maxFileSize) {
            this.maxFileSize = maxFileSize;
            return this;
        }
        public Long getMaxFileSize() {
            return this.maxFileSize;
        }

        public GetAudioNoteUploadUrlResponseBodyData setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetAudioNoteUploadUrlResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetAudioNoteUploadUrlResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetAudioNoteUploadUrlResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetAudioNoteUploadUrlResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
