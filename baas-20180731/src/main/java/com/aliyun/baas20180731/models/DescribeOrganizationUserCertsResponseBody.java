// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationUserCertsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeOrganizationUserCertsResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationUserCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationUserCertsResponseBody self = new DescribeOrganizationUserCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationUserCertsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeOrganizationUserCertsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeOrganizationUserCertsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationUserCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationUserCertsResponseBody setResult(DescribeOrganizationUserCertsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeOrganizationUserCertsResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeOrganizationUserCertsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationUserCertsResponseBodyResultCertificates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("CertData")
        public String certData;

        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("ValidFrom")
        public String validFrom;

        /**
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("ValidTo")
        public String validTo;

        public static DescribeOrganizationUserCertsResponseBodyResultCertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationUserCertsResponseBodyResultCertificates self = new DescribeOrganizationUserCertsResponseBodyResultCertificates();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationUserCertsResponseBodyResultCertificates setCertData(String certData) {
            this.certData = certData;
            return this;
        }
        public String getCertData() {
            return this.certData;
        }

        public DescribeOrganizationUserCertsResponseBodyResultCertificates setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeOrganizationUserCertsResponseBodyResultCertificates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationUserCertsResponseBodyResultCertificates setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeOrganizationUserCertsResponseBodyResultCertificates setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeOrganizationUserCertsResponseBodyResultCertificates setValidFrom(String validFrom) {
            this.validFrom = validFrom;
            return this;
        }
        public String getValidFrom() {
            return this.validFrom;
        }

        public DescribeOrganizationUserCertsResponseBodyResultCertificates setValidTo(String validTo) {
            this.validTo = validTo;
            return this;
        }
        public String getValidTo() {
            return this.validTo;
        }

    }

    public static class DescribeOrganizationUserCertsResponseBodyResultKeyPair extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("PrivateKey")
        public String privateKey;

        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        public static DescribeOrganizationUserCertsResponseBodyResultKeyPair build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationUserCertsResponseBodyResultKeyPair self = new DescribeOrganizationUserCertsResponseBodyResultKeyPair();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationUserCertsResponseBodyResultKeyPair setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public DescribeOrganizationUserCertsResponseBodyResultKeyPair setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

    }

    public static class DescribeOrganizationUserCertsResponseBodyResult extends TeaModel {
        @NameInMap("Certificates")
        public java.util.List<DescribeOrganizationUserCertsResponseBodyResultCertificates> certificates;

        @NameInMap("KeyPair")
        public DescribeOrganizationUserCertsResponseBodyResultKeyPair keyPair;

        public static DescribeOrganizationUserCertsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationUserCertsResponseBodyResult self = new DescribeOrganizationUserCertsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationUserCertsResponseBodyResult setCertificates(java.util.List<DescribeOrganizationUserCertsResponseBodyResultCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<DescribeOrganizationUserCertsResponseBodyResultCertificates> getCertificates() {
            return this.certificates;
        }

        public DescribeOrganizationUserCertsResponseBodyResult setKeyPair(DescribeOrganizationUserCertsResponseBodyResultKeyPair keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public DescribeOrganizationUserCertsResponseBodyResultKeyPair getKeyPair() {
            return this.keyPair;
        }

    }

}
