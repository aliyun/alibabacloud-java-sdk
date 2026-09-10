// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GenerateFileUploadParamsResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The file upload parameters.</p>
     */
    @NameInMap("Data")
    public GenerateFileUploadParamsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance llm-xdne77rxe14ziszr
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of dynamic error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D771A1B6-3D5F-174A-BEE1-98CE1000D337</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateFileUploadParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadParamsResponseBody self = new GenerateFileUploadParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadParamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateFileUploadParamsResponseBody setData(GenerateFileUploadParamsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateFileUploadParamsResponseBodyData getData() {
        return this.data;
    }

    public GenerateFileUploadParamsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateFileUploadParamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateFileUploadParamsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GenerateFileUploadParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateFileUploadParamsResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKey ID used for signing.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NYGg9ejEjYqySx3EsuRutagbd</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The OSS secret used for authorized file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>DGhwedF4SsbsqUMfzNBCjZFLJZSAdhiSE4hFPbKMm6JE</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The name of the OSS bucket where files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cab</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The upload validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>1774794266093</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The upload file path.</p>
         * 
         * <strong>example:</strong>
         * <p>vocabulary/B678CA67-C8CB-150C-AD7F-6FA7F0A811BA_热词导入模版 (7).zip</p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <p>The access domain name of OSS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cab.oss-cn-hangzhou.aliyuncs.com">http://cab.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The policy that OSS uses to verify the validity of the request form fields.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNi0wMy0yOVQxMzoyNDoyNi4yMDNaIiwiY29uZGl0aW9ucyI6W239</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The security token.</p>
         * 
         * <strong>example:</strong>
         * <p>CAISzwJ1q6Ft5B2yfSjIr5ryLIjRh5pL7rOSUV6CoXMgXvpYjqLJhjz2IHhMfnlvB+gYsfU2m2xR5/Yclrp6SJtIXleCZtF94oxN9h2gb4fb42Jqag+/08/LI3OaLjKm9u2wCryLYbGwU/OpbE++5U0X6LDmdDKkckW4OJmS8/BOZcgWWQ/KBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO/ks0GG3ASmlrFF+9mufMb5M/MBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs+02c5onHUwYPu0vZYrOLroQ+fFFjHKMzDdtPq/7ylPI9ofDamIXxxAarin3kufQeLmrJ4LwneIvBXr5RHd5wa2rbWAEsmLNBEhL2EJMKtT476hcbIAuUI3bC5F+kxOHp9i6ErImtRWbLssUUla4R5TGOWbLJWzkTH93xuRqAAapuIRuRt0d2Odr1hsaYukMd42UkNapdTrehzmXeR6lyv1jlLmkAHve9Cbl9N5bO3A96FSlEfjHksQBWG0CEXRm3jLW41bpR00dgnM6gpOj7lRW2z33L0dTtaRw79X3+Uqz3gv9md5QvoaVi1jnr/cFRNxbjl7DI39pdcGlTI2lqIAA=</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The signature information calculated based on the AccessKey secret and the policy. When you call an OSS API operation, OSS verifies this signature information to confirm the validity of the POST request.</p>
         * 
         * <strong>example:</strong>
         * <p>6oETypl+gbYHwbgcwnQiyDYoQbA=</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static GenerateFileUploadParamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateFileUploadParamsResponseBodyData self = new GenerateFileUploadParamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateFileUploadParamsResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GenerateFileUploadParamsResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GenerateFileUploadParamsResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GenerateFileUploadParamsResponseBodyData setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public GenerateFileUploadParamsResponseBodyData setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public GenerateFileUploadParamsResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateFileUploadParamsResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateFileUploadParamsResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GenerateFileUploadParamsResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GenerateFileUploadParamsResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
