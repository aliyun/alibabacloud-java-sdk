// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseUploadSignatureResponseBody extends TeaModel {
    /**
     * <p>The upload signature details.</p>
     */
    @NameInMap("Data")
    public DescribeKnowledgeBaseUploadSignatureResponseBodyData data;

    /**
     * <p>The error code if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>KnowledgeBaseNotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource not found xxx</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The unique ID of the request. If an error occurs, use this ID to troubleshoot the issue.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeKnowledgeBaseUploadSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseUploadSignatureResponseBody self = new DescribeKnowledgeBaseUploadSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseUploadSignatureResponseBody setData(DescribeKnowledgeBaseUploadSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeKnowledgeBaseUploadSignatureResponseBodyData getData() {
        return this.data;
    }

    public DescribeKnowledgeBaseUploadSignatureResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeKnowledgeBaseUploadSignatureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeKnowledgeBaseUploadSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeBaseUploadSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeKnowledgeBaseUploadSignatureResponseBodyData extends TeaModel {
        /**
         * <p>The credential scope string for the signature.</p>
         */
        @NameInMap("OssCredential")
        public String ossCredential;

        /**
         * <p>The request time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>20260101T135341Z</p>
         */
        @NameInMap("OssDate")
        public String ossDate;

        /**
         * <p>The STS token used for uploading to OSS. It is valid for one hour.</p>
         * 
         * <strong>example:</strong>
         * <p>CAIS4gJ1q6Ft5B2yfSjIr5vPHMj4p+lHx/utUUjg13ptZ+5u3oDzkzz2IHhMdXlrCOgYt/8xnG1V6f8flrJ/ToQAX0HfatZq5ZkS9AqnaoXM/te496IFg5D9y7dIs8GgjqHoeOzcYI73WJXEMiLp9EJaxb/9ak/RPTiMOoGIjphKd8keWhLCAxNNGNZRIHkJyqZYTwyzU8ygKRn3mGHdIVN1sw5n8wNF5L+439eX52i17jS46JdM/9ysesH5NpQxbMwkDYnk5oEsKPqdihw3wgNR6aJ7gJZD/Tr6pdyHCzFTmU7ea7uEqYw3clYiOPBnRvEd8eKPnPl5q/HVm4Hs0wxKNuxOSCXZS4yp3MLeH+ekJgOGwWFHz9qnOLmtQXqV22tMCRpzXIj6Zlmz+/reI6iNW+Ory74mxSFbrz3ZP4yv+o+Yv3QbMVumcySkKVbBbVvnv0R8GNsIC2lMUbp+rfShhfFuG2QagAECCyigwAlSAryrFmteD+EVuvxvi0NE7zDJLbUkhek6dcY+/u5V5jcmvL67CQ7bTNk+9lV8WDCvtoCD9ucqTaHweJEd8fS2DaFedAMDf8BfZa2C1CTLhVXdSgE2WORYbMqidelRm7dH3fTbZVvryWKDaveDRLt5J/Qfs**********</p>
         */
        @NameInMap("OssSecurityToken")
        public String ossSecurityToken;

        /**
         * <p>The authentication signature.</p>
         * 
         * <strong>example:</strong>
         * <p>9bebe0900716bdefaab899781c7bdfd614ec6ed711e0de5ddf6f5a**********</p>
         */
        @NameInMap("OssSignature")
        public String ossSignature;

        /**
         * <p>The signature version and algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS4-HMAC-SHA256</p>
         */
        @NameInMap("OssSignatureVersion")
        public String ossSignatureVersion;

        /**
         * <p>The Base64-encoded POST policy that specifies the conditions for the file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJjb25kaXRpb25zIjpbeyJ4LW9zcy1jcmVkZW50aWFsIjoiU1RTLk5aRmR2RDJRWlFSeWlwZmpkS295NEYxb2ovMjAyNjA1MTQvY24taGFuZ3pob3Uvb3NzL2FsaXl1bl92NF9yZXF1ZXN0In0seyJ4LW9zcy1kYXRlIjoiMjAyNjA1MTRUMDMzMjI3WiJ9LHsieC1vc3Mtc2VjdXJpdHktdG9rZW4iOiJDQUlTMmdKMXE2RnQ1QjJ5ZlNqSXI1bnpMOHp3MzQ1NzVwQ1NhMWJYam1RZVkvWVlxZlRFaUR6MklIaE1**</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The path prefix for the file upload.</p>
         */
        @NameInMap("UploadDir")
        public String uploadDir;

        /**
         * <p>The destination URL for the file upload.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://onemeta-kb-staging.oss-cn-hangzhou.aliyuncs.com">https://onemeta-kb-staging.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("UploadHost")
        public String uploadHost;

        public static DescribeKnowledgeBaseUploadSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseUploadSignatureResponseBodyData self = new DescribeKnowledgeBaseUploadSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseUploadSignatureResponseBodyData setOssCredential(String ossCredential) {
            this.ossCredential = ossCredential;
            return this;
        }
        public String getOssCredential() {
            return this.ossCredential;
        }

        public DescribeKnowledgeBaseUploadSignatureResponseBodyData setOssDate(String ossDate) {
            this.ossDate = ossDate;
            return this;
        }
        public String getOssDate() {
            return this.ossDate;
        }

        public DescribeKnowledgeBaseUploadSignatureResponseBodyData setOssSecurityToken(String ossSecurityToken) {
            this.ossSecurityToken = ossSecurityToken;
            return this;
        }
        public String getOssSecurityToken() {
            return this.ossSecurityToken;
        }

        public DescribeKnowledgeBaseUploadSignatureResponseBodyData setOssSignature(String ossSignature) {
            this.ossSignature = ossSignature;
            return this;
        }
        public String getOssSignature() {
            return this.ossSignature;
        }

        public DescribeKnowledgeBaseUploadSignatureResponseBodyData setOssSignatureVersion(String ossSignatureVersion) {
            this.ossSignatureVersion = ossSignatureVersion;
            return this;
        }
        public String getOssSignatureVersion() {
            return this.ossSignatureVersion;
        }

        public DescribeKnowledgeBaseUploadSignatureResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeKnowledgeBaseUploadSignatureResponseBodyData setUploadDir(String uploadDir) {
            this.uploadDir = uploadDir;
            return this;
        }
        public String getUploadDir() {
            return this.uploadDir;
        }

        public DescribeKnowledgeBaseUploadSignatureResponseBodyData setUploadHost(String uploadHost) {
            this.uploadHost = uploadHost;
            return this;
        }
        public String getUploadHost() {
            return this.uploadHost;
        }

    }

}
