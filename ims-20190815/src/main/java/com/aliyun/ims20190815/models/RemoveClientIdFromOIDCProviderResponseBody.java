// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveClientIdFromOIDCProviderResponseBody extends TeaModel {
    @NameInMap("OIDCProvider")
    public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider OIDCProvider;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveClientIdFromOIDCProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveClientIdFromOIDCProviderResponseBody self = new RemoveClientIdFromOIDCProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveClientIdFromOIDCProviderResponseBody setOIDCProvider(RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider OIDCProvider) {
        this.OIDCProvider = OIDCProvider;
        return this;
    }
    public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider getOIDCProvider() {
        return this.OIDCProvider;
    }

    public RemoveClientIdFromOIDCProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider extends TeaModel {
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

        public static RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider build(java.util.Map<String, ?> map) throws Exception {
            RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider self = new RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider();
            return TeaModel.build(map, self);
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setClientIds(String clientIds) {
            this.clientIds = clientIds;
            return this;
        }
        public String getClientIds() {
            return this.clientIds;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setFingerprints(String fingerprints) {
            this.fingerprints = fingerprints;
            return this;
        }
        public String getFingerprints() {
            return this.fingerprints;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setIssuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            return this;
        }
        public String getIssuerUrl() {
            return this.issuerUrl;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setOIDCProviderName(String OIDCProviderName) {
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }
        public String getOIDCProviderName() {
            return this.OIDCProviderName;
        }

        public RemoveClientIdFromOIDCProviderResponseBodyOIDCProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
