// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterAssociationAllowedPrefixRequest extends TeaModel {
    /**
     * <p>The list of allowed route prefixes.</p>
     */
    @NameInMap("AllowedPrefixes")
    public java.util.List<String> allowedPrefixes;

    /**
     * <p>The prefix routing pattern. Valid values:</p>
     * <ul>
     * <li>MatchMode: Publishes only the configured route prefixes to your data center. Existing specific routes are withdrawn.</li>
     * <li>IncrementalMode: Publishes the configured route prefixes to your data center. Withdraw previously published more specific routes that are covered by the configured prefixes. More specific routes that are not covered by the configured prefixes remain published.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MatchMode</p>
     */
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
     * <p>A client token used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to make sure that the value is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Performs a dry run.</li>
     * <li><strong>false</strong> (default): Sends a normal request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of ECR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("Version")
    public String version;

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

    public ModifyExpressConnectRouterAssociationAllowedPrefixRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
