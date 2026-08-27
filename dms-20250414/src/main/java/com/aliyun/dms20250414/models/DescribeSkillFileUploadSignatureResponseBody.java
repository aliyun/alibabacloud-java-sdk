// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeSkillFileUploadSignatureResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public DescribeSkillFileUploadSignatureResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.                                 </li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSkillFileUploadSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSkillFileUploadSignatureResponseBody self = new DescribeSkillFileUploadSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSkillFileUploadSignatureResponseBody setData(DescribeSkillFileUploadSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSkillFileUploadSignatureResponseBodyData getData() {
        return this.data;
    }

    public DescribeSkillFileUploadSignatureResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeSkillFileUploadSignatureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSkillFileUploadSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSkillFileUploadSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSkillFileUploadSignatureResponseBodyData extends TeaModel {
        /**
         * <p>The parameter set that specifies the derived key.</p>
         */
        @NameInMap("OssCredential")
        public String ossCredential;

        /**
         * <p>The time of the request. The format follows the ISO 8601 date and time standard.</p>
         * 
         * <strong>example:</strong>
         * <p>20260101T135341Z</p>
         */
        @NameInMap("OssDate")
        public String ossDate;

        /**
         * <p>The STS token used for uploading to OSS. The token is valid for 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>CAIS4gJ1q6Ft5B2yfSjIr5vPHMj4p+lHx/utUUjg13ptZ+5u3oDzkzz2IHhMdXlrCOgYt/8xnG1V6f8flrJ/ToQAX0HfatZq5ZkS9AqnaoXM/te496IFg5D9y7dIs8GgjqHoeOzcYI73WJXEMiLp9EJaxb/9ak/RPTiMOoGIjphKd8keWhLCAxNNGNZRIHkJyqZYTwyzU8ygKRn3mGHdIVN1sw5n8wNF5L+439eX52i17jS46JdM/9ysesH5NpQxbMwkDYnk5oEsKPqdihw3wgNR6aJ7gJZD/Tr6pdyHCzFTmU7ea7uEqYw3clYiOPBnRvEd8eKPnPl5q/HVm4Hs0wxKNuxOSCXZS4yp3MLeH+ekJgOGwWFHz9qnOLmtQXqV22tMCRpzXIj6Zlmz+/reI6iNW+Ory74mxSFbrz3ZP4yv+o+Yv3QbMVumcySkKVbBbVvnv0R8GNsIC2lMUbp+rfShhfFuG2QagAECCyigwAlSAryrFmteD+EVuvxvi0NE7zDJLbUkhek6dcY+/u5V5jcmvL67CQ7bTNk+9lV8WDCvtoCD9ucqTaHweJEd8fS2DaFedAMDf8BfZa2C1CTLhVXdSgE2WORYbMqidelRm7dH3fTbZVvryWKDaveDRLt5J/Qfs**********</p>
         */
        @NameInMap("OssSecurityToken")
        public String ossSecurityToken;

        /**
         * <p>The description information used for signature authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>9bebe0900716bdefaab899781c7bdfd614ec6ed711e0de5ddf6f5a**********</p>
         */
        @NameInMap("OssSignature")
        public String ossSignature;

        /**
         * <p>The version and algorithm of the signature.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS4-HMAC-SHA256</p>
         */
        @NameInMap("OssSignatureVersion")
        public String ossSignatureVersion;

        /**
         * <p>The permission restrictions and constraints for file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJjb25kaXRpb25zIjpbeyJ4LW9zcy1jcmVkZW50aWFsIjoiU1RTLk5YeldyTEo2ZnA5RlNuUTN6OGthQjFFWH**********</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The path for file upload.</p>
         */
        @NameInMap("UploadDir")
        public String uploadDir;

        /**
         * <p>The destination address for file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>https://**********.oss-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("UploadHost")
        public String uploadHost;

        public static DescribeSkillFileUploadSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSkillFileUploadSignatureResponseBodyData self = new DescribeSkillFileUploadSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSkillFileUploadSignatureResponseBodyData setOssCredential(String ossCredential) {
            this.ossCredential = ossCredential;
            return this;
        }
        public String getOssCredential() {
            return this.ossCredential;
        }

        public DescribeSkillFileUploadSignatureResponseBodyData setOssDate(String ossDate) {
            this.ossDate = ossDate;
            return this;
        }
        public String getOssDate() {
            return this.ossDate;
        }

        public DescribeSkillFileUploadSignatureResponseBodyData setOssSecurityToken(String ossSecurityToken) {
            this.ossSecurityToken = ossSecurityToken;
            return this;
        }
        public String getOssSecurityToken() {
            return this.ossSecurityToken;
        }

        public DescribeSkillFileUploadSignatureResponseBodyData setOssSignature(String ossSignature) {
            this.ossSignature = ossSignature;
            return this;
        }
        public String getOssSignature() {
            return this.ossSignature;
        }

        public DescribeSkillFileUploadSignatureResponseBodyData setOssSignatureVersion(String ossSignatureVersion) {
            this.ossSignatureVersion = ossSignatureVersion;
            return this;
        }
        public String getOssSignatureVersion() {
            return this.ossSignatureVersion;
        }

        public DescribeSkillFileUploadSignatureResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeSkillFileUploadSignatureResponseBodyData setUploadDir(String uploadDir) {
            this.uploadDir = uploadDir;
            return this;
        }
        public String getUploadDir() {
            return this.uploadDir;
        }

        public DescribeSkillFileUploadSignatureResponseBodyData setUploadHost(String uploadHost) {
            this.uploadHost = uploadHost;
            return this;
        }
        public String getUploadHost() {
            return this.uploadHost;
        }

    }

}
