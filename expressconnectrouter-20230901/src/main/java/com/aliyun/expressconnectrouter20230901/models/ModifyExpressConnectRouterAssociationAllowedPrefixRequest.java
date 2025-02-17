// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterAssociationAllowedPrefixRequest extends TeaModel {
    /**
     * <p>The allowed route prefixes.</p>
     */
    @NameInMap("AllowedPrefixes")
    public java.util.List<String> allowedPrefixes;

    @NameInMap("AllowedPrefixesMode")
    public String allowedPrefixesMode;

    /**
     * <p>The ID of the association between the ECR and the VPC or TR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-assoc-9p2qxx5phpca2m****</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ECR ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
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

    public ModifyExpressConnectRouterAssociationAllowedPrefixRequest setAllowedPrefixesMode(String allowedPrefixesMode) {
        this.allowedPrefixesMode = allowedPrefixesMode;
        return this;
    }
    public String getAllowedPrefixesMode() {
        return this.allowedPrefixesMode;
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
