// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddFingerprintToOIDCProviderResponseBody extends TeaModel {
    @NameInMap("OIDCProvider")
    public AddFingerprintToOIDCProviderResponseBodyOIDCProvider OIDCProvider;

    @NameInMap("RequestId")
    public String requestId;

    public static AddFingerprintToOIDCProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFingerprintToOIDCProviderResponseBody self = new AddFingerprintToOIDCProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFingerprintToOIDCProviderResponseBody setOIDCProvider(AddFingerprintToOIDCProviderResponseBodyOIDCProvider OIDCProvider) {
        this.OIDCProvider = OIDCProvider;
        return this;
    }
    public AddFingerprintToOIDCProviderResponseBodyOIDCProvider getOIDCProvider() {
        return this.OIDCProvider;
    }

    public AddFingerprintToOIDCProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddFingerprintToOIDCProviderResponseBodyOIDCProvider extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("ClientIds")
        public String clientIds;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Fingerprints")
        public String fingerprints;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IssuerUrl")
        public String issuerUrl;

        @NameInMap("OIDCProviderName")
        public String OIDCProviderName;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static AddFingerprintToOIDCProviderResponseBodyOIDCProvider build(java.util.Map<String, ?> map) throws Exception {
            AddFingerprintToOIDCProviderResponseBodyOIDCProvider self = new AddFingerprintToOIDCProviderResponseBodyOIDCProvider();
            return TeaModel.build(map, self);
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setClientIds(String clientIds) {
            this.clientIds = clientIds;
            return this;
        }
        public String getClientIds() {
            return this.clientIds;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setFingerprints(String fingerprints) {
            this.fingerprints = fingerprints;
            return this;
        }
        public String getFingerprints() {
            return this.fingerprints;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setIssuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            return this;
        }
        public String getIssuerUrl() {
            return this.issuerUrl;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setOIDCProviderName(String OIDCProviderName) {
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }
        public String getOIDCProviderName() {
            return this.OIDCProviderName;
        }

        public AddFingerprintToOIDCProviderResponseBodyOIDCProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
