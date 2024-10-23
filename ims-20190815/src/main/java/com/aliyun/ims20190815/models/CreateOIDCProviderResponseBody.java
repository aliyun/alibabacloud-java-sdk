// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateOIDCProviderResponseBody extends TeaModel {
    /**
     * <p>The information about the OIDC IdP.</p>
     */
    @NameInMap("OIDCProvider")
    public CreateOIDCProviderResponseBodyOIDCProvider OIDCProvider;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64B11B41-636D-51E3-A39B-C8703CD2218C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOIDCProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOIDCProviderResponseBody self = new CreateOIDCProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOIDCProviderResponseBody setOIDCProvider(CreateOIDCProviderResponseBodyOIDCProvider OIDCProvider) {
        this.OIDCProvider = OIDCProvider;
        return this;
    }
    public CreateOIDCProviderResponseBodyOIDCProvider getOIDCProvider() {
        return this.OIDCProvider;
    }

    public CreateOIDCProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOIDCProviderResponseBodyOIDCProvider extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the OIDC IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::177242285274****:oidc-provider/TestOIDCProvider</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>498469743454717****</p>
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
         * <p>This is an OIDC Provider.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The fingerprint of the HTTPS certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>902ef2deeb3c5b13ea4c3d5193629309e231****</p>
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
         * <p>1636613763000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The earliest time when an external IdP can issue an ID token. If the value of the iat field in the ID token is later than the current time, the request is rejected. Unit: hours. Valid values: 1 to 168.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
         * <p>2021-11-11T06:56:03Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static CreateOIDCProviderResponseBodyOIDCProvider build(java.util.Map<String, ?> map) throws Exception {
            CreateOIDCProviderResponseBodyOIDCProvider self = new CreateOIDCProviderResponseBodyOIDCProvider();
            return TeaModel.build(map, self);
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setClientIds(String clientIds) {
            this.clientIds = clientIds;
            return this;
        }
        public String getClientIds() {
            return this.clientIds;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setFingerprints(String fingerprints) {
            this.fingerprints = fingerprints;
            return this;
        }
        public String getFingerprints() {
            return this.fingerprints;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setIssuanceLimitTime(Long issuanceLimitTime) {
            this.issuanceLimitTime = issuanceLimitTime;
            return this;
        }
        public Long getIssuanceLimitTime() {
            return this.issuanceLimitTime;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setIssuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            return this;
        }
        public String getIssuerUrl() {
            return this.issuerUrl;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setOIDCProviderName(String OIDCProviderName) {
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }
        public String getOIDCProviderName() {
            return this.OIDCProviderName;
        }

        public CreateOIDCProviderResponseBodyOIDCProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
