// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveFingerprintFromOIDCProviderResponseBody extends TeaModel {
    /**
     * <p>The information about the OIDC IdP.</p>
     */
    @NameInMap("OIDCProvider")
    public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider OIDCProvider;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C90CE971-4C7F-5D93-BD3E-2D0E79D03C01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveFingerprintFromOIDCProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveFingerprintFromOIDCProviderResponseBody self = new RemoveFingerprintFromOIDCProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveFingerprintFromOIDCProviderResponseBody setOIDCProvider(RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider OIDCProvider) {
        this.OIDCProvider = OIDCProvider;
        return this;
    }
    public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider getOIDCProvider() {
        return this.OIDCProvider;
    }

    public RemoveFingerprintFromOIDCProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the OIDC IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::177242285274****:oidc-provider/TestOIDCProvider</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the client. If multiple client IDs are returned, the client IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>0oa4u6l8x5WoaVbd****</p>
         */
        @NameInMap("ClientIds")
        public String clientIds;

        /**
         * <p>The time when the OIDC IdP was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-11T06:56:03Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the OIDC IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a new OIDC Provider.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The fingerprint of the HTTPS certificate. If multiple fingerprints are returned, the fingerprints are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>5938fd4d98bab03faadb97b34396831e3780****</p>
         */
        @NameInMap("Fingerprints")
        public String fingerprints;

        /**
         * <p>The timestamp when the OIDC IdP was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1636613763000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The timestamp when the OIDC IdP was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1636706309000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The earliest time when an external IdP can issue an ID token. If the value of the iat field in the ID token is later than the current time, the request is rejected. Unit: hours. Valid values: 1 to 168.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IssuanceLimitTime")
        public Long issuanceLimitTime;

        /**
         * <p>The URL of the issuer.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dev-xxxxxx.okta.com">https://dev-xxxxxx.okta.com</a></p>
         */
        @NameInMap("IssuerUrl")
        public String issuerUrl;

        /**
         * <p>The name of the OIDC IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>TestOIDCProvider</p>
         */
        @NameInMap("OIDCProviderName")
        public String OIDCProviderName;

        /**
         * <p>The time when the OIDC IdP was modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-12T08:38:29Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider build(java.util.Map<String, ?> map) throws Exception {
            RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider self = new RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider();
            return TeaModel.build(map, self);
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setClientIds(String clientIds) {
            this.clientIds = clientIds;
            return this;
        }
        public String getClientIds() {
            return this.clientIds;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setFingerprints(String fingerprints) {
            this.fingerprints = fingerprints;
            return this;
        }
        public String getFingerprints() {
            return this.fingerprints;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setIssuanceLimitTime(Long issuanceLimitTime) {
            this.issuanceLimitTime = issuanceLimitTime;
            return this;
        }
        public Long getIssuanceLimitTime() {
            return this.issuanceLimitTime;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setIssuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            return this;
        }
        public String getIssuerUrl() {
            return this.issuerUrl;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setOIDCProviderName(String OIDCProviderName) {
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }
        public String getOIDCProviderName() {
            return this.OIDCProviderName;
        }

        public RemoveFingerprintFromOIDCProviderResponseBodyOIDCProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
