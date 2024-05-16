// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterAssociationRequest extends TeaModel {
    @NameInMap("AllowedPrefixes")
    public java.util.List<String> allowedPrefixes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssociationRegionId")
    public String associationRegionId;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CreateAttachment")
    public Boolean createAttachment;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterOwnerId")
    public Long transitRouterOwnerId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcOwnerId")
    public Long vpcOwnerId;

    public static CreateExpressConnectRouterAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectRouterAssociationRequest self = new CreateExpressConnectRouterAssociationRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectRouterAssociationRequest setAllowedPrefixes(java.util.List<String> allowedPrefixes) {
        this.allowedPrefixes = allowedPrefixes;
        return this;
    }
    public java.util.List<String> getAllowedPrefixes() {
        return this.allowedPrefixes;
    }

    public CreateExpressConnectRouterAssociationRequest setAssociationRegionId(String associationRegionId) {
        this.associationRegionId = associationRegionId;
        return this;
    }
    public String getAssociationRegionId() {
        return this.associationRegionId;
    }

    public CreateExpressConnectRouterAssociationRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateExpressConnectRouterAssociationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateExpressConnectRouterAssociationRequest setCreateAttachment(Boolean createAttachment) {
        this.createAttachment = createAttachment;
        return this;
    }
    public Boolean getCreateAttachment() {
        return this.createAttachment;
    }

    public CreateExpressConnectRouterAssociationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateExpressConnectRouterAssociationRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public CreateExpressConnectRouterAssociationRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateExpressConnectRouterAssociationRequest setTransitRouterOwnerId(Long transitRouterOwnerId) {
        this.transitRouterOwnerId = transitRouterOwnerId;
        return this;
    }
    public Long getTransitRouterOwnerId() {
        return this.transitRouterOwnerId;
    }

    public CreateExpressConnectRouterAssociationRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateExpressConnectRouterAssociationRequest setVpcOwnerId(Long vpcOwnerId) {
        this.vpcOwnerId = vpcOwnerId;
        return this;
    }
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

}
