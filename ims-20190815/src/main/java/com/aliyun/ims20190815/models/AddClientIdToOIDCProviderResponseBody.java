// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddClientIdToOIDCProviderResponseBody extends TeaModel {
    @NameInMap("OIDCProvider")
    public AddClientIdToOIDCProviderResponseBodyOIDCProvider OIDCProvider;

    @NameInMap("RequestId")
    public String requestId;

    public static AddClientIdToOIDCProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddClientIdToOIDCProviderResponseBody self = new AddClientIdToOIDCProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public AddClientIdToOIDCProviderResponseBody setOIDCProvider(AddClientIdToOIDCProviderResponseBodyOIDCProvider OIDCProvider) {
        this.OIDCProvider = OIDCProvider;
        return this;
    }
    public AddClientIdToOIDCProviderResponseBodyOIDCProvider getOIDCProvider() {
        return this.OIDCProvider;
    }

    public AddClientIdToOIDCProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddClientIdToOIDCProviderResponseBodyOIDCProvider extends TeaModel {
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

        public static AddClientIdToOIDCProviderResponseBodyOIDCProvider build(java.util.Map<String, ?> map) throws Exception {
            AddClientIdToOIDCProviderResponseBodyOIDCProvider self = new AddClientIdToOIDCProviderResponseBodyOIDCProvider();
            return TeaModel.build(map, self);
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setClientIds(String clientIds) {
            this.clientIds = clientIds;
            return this;
        }
        public String getClientIds() {
            return this.clientIds;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setFingerprints(String fingerprints) {
            this.fingerprints = fingerprints;
            return this;
        }
        public String getFingerprints() {
            return this.fingerprints;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setIssuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            return this;
        }
        public String getIssuerUrl() {
            return this.issuerUrl;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setOIDCProviderName(String OIDCProviderName) {
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }
        public String getOIDCProviderName() {
            return this.OIDCProviderName;
        }

        public AddClientIdToOIDCProviderResponseBodyOIDCProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
