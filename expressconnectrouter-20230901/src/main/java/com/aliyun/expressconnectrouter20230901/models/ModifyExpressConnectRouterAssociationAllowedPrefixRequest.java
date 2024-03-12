// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterAssociationAllowedPrefixRequest extends TeaModel {
    @NameInMap("AllowedPrefixes")
    public java.util.List<String> allowedPrefixes;

    @NameInMap("AssociationId")
    public String associationId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyExpressConnectRouterAssociationAllowedPrefixRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectRouterAssociationAllowedPrefixRequest self = new ModifyExpressConnectRouterAssociationAllowedPrefixRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixRequest setAllowedPrefixes(java.util.List<String> allowedPrefixes) {
        this.allowedPrefixes = allowedPrefixes;
        return this;
    }
    public java.util.List<String> getAllowedPrefixes() {
        return this.allowedPrefixes;
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixRequest setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
