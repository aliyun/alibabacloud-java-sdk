// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentThemeUploadSignatureResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public GetDataAgentThemeUploadSignatureResponseBodyData data;

    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataAgentThemeUploadSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentThemeUploadSignatureResponseBody self = new GetDataAgentThemeUploadSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataAgentThemeUploadSignatureResponseBody setData(GetDataAgentThemeUploadSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataAgentThemeUploadSignatureResponseBodyData getData() {
        return this.data;
    }

    public GetDataAgentThemeUploadSignatureResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataAgentThemeUploadSignatureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataAgentThemeUploadSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAgentThemeUploadSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataAgentThemeUploadSignatureResponseBodyData extends TeaModel {
        /**
         * <p>The policy expiration time in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T14:53:41Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The target object key, which is exactly locked by the policy.</p>
         */
        @NameInMap("ObjectKey")
        public String objectKey;

        /**
         * <p>The parameter set that specifies the derived key.</p>
         */
        @NameInMap("OssCredential")
        public String ossCredential;

        /**
         * <p>The signature time in the format of yyyyMMdd\&quot;T\&quot;HHmmss\&quot;Z\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>20260101T135341Z</p>
         */
        @NameInMap("OssDate")
        public String ossDate;

        /**
         * <p>The STS token used to upload files to OSS. The token is valid for 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>CAIS4gJ1q6Ft5B2yfSjIr5vPHMj4p+lHx/utUUjg13ptZ+5u3oDzkzz2IHhMdXlrCOgYt/8xnG1V6f8flrJ/ToQAX0HfatZq5ZkS9AqnaoXM/te496IFg5D9y7dIs8GgjqHoeOzcYI73WJXEMiLp9EJaxb/9ak/RPTiMOoGIjphKd8keWhLCAxNNGNZRIHkJyqZYTwyzU8ygKRn3mGHdIVN1sw5n8wNF5L+439eX52i17jS46JdM/9ysesH5NpQxbMwkDYnk5oEsKPqdihw3wgNR6aJ7gJZD/Tr6pdyHCzFTmU7ea7uEqYw3clYiOPBnRvEd8eKPnPl5q/HVm2Hs0wxKNuxOSCXZS4yp3MLeH+ekJgOGwWFHz9qnOLmtQXqV22tMCRpzXIj6Zlmz+/reI6iNW+Ory74mxSFbrz3ZP4yv+o+Yv3QbMVumcySkKVbBbVvnv0R8GNsIC2lMUbp+rfShhfFuG2QagAECCyigwAlSAryrFmteD+EVuvxvi0NE7zDJLbUkhek6dcY+/u5V5jcmvL67cQ7bTNk+9lV8WDCvtoCD9ucqTaHweJEd8fS2DaFedAMDf8BfZa2C1CTLhVXdSgE2WORYbMqidelRm7dH3fTbZVvryWKDaveDRLt5J/Qfs**********</p>
         */
        @NameInMap("OssSecurityToken")
        public String ossSecurityToken;

        /**
         * <p>The V4 signature value.</p>
         * 
         * <strong>example:</strong>
         * <p>9bebe0900716bdefaab899781c7bdfd614ec6ed711e0de5ddf6f5a**********</p>
         */
        @NameInMap("OssSignature")
        public String ossSignature;

        /**
         * <p>The signature version. The value is fixed as OSS4-HMAC-SHA256.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS4-HMAC-SHA256</p>
         */
        @NameInMap("OssSignatureVersion")
        public String ossSignatureVersion;

        /**
         * <p>The Base64-encoded value of the policy JSON.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJjb25kaXRpb25zIjpbeyJ4LW9zcy1jcmVkZW50aWFsIjoiU1RTLk5YeldyTEo2ZnA5RlNuUTN6OGthQjFFWH**********</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The theme business identifier generated or reused for this request. Pass this identifier to the CreateDataAgentTheme operation after the upload is complete to register the metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>0f8b2c1d****a3e5f7b1c2d</p>
         */
        @NameInMap("ThemeId")
        public String themeId;

        /**
         * <p>The upload directory prefix.</p>
         */
        @NameInMap("UploadDir")
        public String uploadDir;

        /**
         * <p>The PostObject destination address over the public network.</p>
         * 
         * <strong>example:</strong>
         * <p>https://**********.oss-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("UploadHost")
        public String uploadHost;

        public static GetDataAgentThemeUploadSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataAgentThemeUploadSignatureResponseBodyData self = new GetDataAgentThemeUploadSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setOssCredential(String ossCredential) {
            this.ossCredential = ossCredential;
            return this;
        }
        public String getOssCredential() {
            return this.ossCredential;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setOssDate(String ossDate) {
            this.ossDate = ossDate;
            return this;
        }
        public String getOssDate() {
            return this.ossDate;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setOssSecurityToken(String ossSecurityToken) {
            this.ossSecurityToken = ossSecurityToken;
            return this;
        }
        public String getOssSecurityToken() {
            return this.ossSecurityToken;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setOssSignature(String ossSignature) {
            this.ossSignature = ossSignature;
            return this;
        }
        public String getOssSignature() {
            return this.ossSignature;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setOssSignatureVersion(String ossSignatureVersion) {
            this.ossSignatureVersion = ossSignatureVersion;
            return this;
        }
        public String getOssSignatureVersion() {
            return this.ossSignatureVersion;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setThemeId(String themeId) {
            this.themeId = themeId;
            return this;
        }
        public String getThemeId() {
            return this.themeId;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setUploadDir(String uploadDir) {
            this.uploadDir = uploadDir;
            return this;
        }
        public String getUploadDir() {
            return this.uploadDir;
        }

        public GetDataAgentThemeUploadSignatureResponseBodyData setUploadHost(String uploadHost) {
            this.uploadHost = uploadHost;
            return this;
        }
        public String getUploadHost() {
            return this.uploadHost;
        }

    }

}
