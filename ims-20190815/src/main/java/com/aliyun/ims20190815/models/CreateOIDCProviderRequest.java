// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateOIDCProviderRequest extends TeaModel {
    @NameInMap("ClientIds")
    public String clientIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("Fingerprints")
    public String fingerprints;

    @NameInMap("IssuerUrl")
    public String issuerUrl;

    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static CreateOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOIDCProviderRequest self = new CreateOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOIDCProviderRequest setClientIds(String clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public String getClientIds() {
        return this.clientIds;
    }

    public CreateOIDCProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOIDCProviderRequest setFingerprints(String fingerprints) {
        this.fingerprints = fingerprints;
        return this;
    }
    public String getFingerprints() {
        return this.fingerprints;
    }

    public CreateOIDCProviderRequest setIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
        return this;
    }
    public String getIssuerUrl() {
        return this.issuerUrl;
    }

    public CreateOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
