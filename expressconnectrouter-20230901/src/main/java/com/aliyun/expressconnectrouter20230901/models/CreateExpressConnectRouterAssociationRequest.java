// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterAssociationRequest extends TeaModel {
    /**
     * <p>The allowed route prefixes.</p>
     */
    @NameInMap("AllowedPrefixes")
    public java.util.List<String> allowedPrefixes;

    @NameInMap("AllowedPrefixesMode")
    public String allowedPrefixesMode;

    /**
     * <p>The region ID of the resource to be associated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssociationRegionId")
    public String associationRegionId;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-of3o1the3i4gwb****</p>
     */
    @NameInMap("CenId")
    public String cenId;

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
     * <p>Specifies whether to initiate an association on the TR when the ECR is associated with the TR. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: You do not need to initiate an association on the TR.</li>
     * <li><strong>false</strong>: You need to initiate an association on the TR.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreateAttachment")
    public Boolean createAttachment;

    @NameInMap("Description")
    public String description;

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

    /**
     * <p>The TR ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-2ze4i71c6be454e2l****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the TR. Default value: ID of the Alibaba Cloud account that logs in.</p>
     * <blockquote>
     * <p> If you want to connect to a network instance that belongs to a different account, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>189159362009****</p>
     */
    @NameInMap("TransitRouterOwnerId")
    public Long transitRouterOwnerId;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1h37fchc6jmfyln****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the VPC. Default value: ID of the Alibaba Cloud account that logs in.</p>
     * <blockquote>
     * <p> If you want to connect to a network instance that belongs to a different account, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>132193271328****</p>
     */
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

    public CreateExpressConnectRouterAssociationRequest setAllowedPrefixesMode(String allowedPrefixesMode) {
        this.allowedPrefixesMode = allowedPrefixesMode;
        return this;
    }
    public String getAllowedPrefixesMode() {
        return this.allowedPrefixesMode;
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

    public CreateExpressConnectRouterAssociationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
