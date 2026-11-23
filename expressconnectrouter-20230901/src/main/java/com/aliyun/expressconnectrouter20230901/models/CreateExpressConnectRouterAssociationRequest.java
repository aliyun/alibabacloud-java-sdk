// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterAssociationRequest extends TeaModel {
    /**
     * <p>The list of allowed route prefixes.</p>
     */
    @NameInMap("AllowedPrefixes")
    public java.util.List<String> allowedPrefixes;

    /**
     * <p>The route prefix mode. Valid values:</p>
     * <ul>
     * <li>MatchMode: match mode. Only the configured route CIDR blocks are advertised to the data center, and the previously advertised specific routes are withdrawn.</li>
     * <li>IncrementalMode: incremental mode. The configured route CIDR blocks are advertised to the data center. The previously advertised specific routes that fall within the configured route CIDR blocks are withdrawn, and the specific routes that do not fall within the configured CIDR blocks remain advertised.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MatchMode</p>
     */
    @NameInMap("AllowedPrefixesMode")
    public String allowedPrefixesMode;

    /**
     * <p>The region where the associated resource resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssociationRegionId")
    public String associationRegionId;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * <blockquote>
     * <p>If you specify TransitRouterId, CenId is required. You must first call the CreateCen operation of the Cbn (2017-09-12) service to create a CEN instance and obtain the CEN instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cen-of3o1the3i4gwb****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value from your client to ensure that the value is unique among different requests. The client token only supports ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to initiate an association when the Express Connect Router is associated with the transit router. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: No association is initiated on the transit router side.</li>
     * <li><strong>false</strong>: An association is initiated on the transit router side.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreateAttachment")
    public Boolean createAttachment;

    /**
     * <p>The description of the associated resource. The description must be 0 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only perform a dry run for this request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The system sends a check request without modifying service resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): The system sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Express Connect Router (ECR).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The list of tags.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateExpressConnectRouterAssociationRequestTag> tag;

    /**
     * <p>The ID of the transit router.</p>
     * <blockquote>
     * <p>The TransitRouterId and VpcId parameters are mutually exclusive. You must specify one of them. You must first call the CreateTransitRouter operation of the Cbn (2017-09-12) service to create a transit router and obtain the transit router ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tr-2ze4i71c6be454e2l****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the transit router instance belongs. The transit router is used to forward routing traffic. Default value: the current logon Alibaba Cloud account ID.</p>
     * <blockquote>
     * <p>If you want to load a network instance across accounts, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>189159362009****</p>
     */
    @NameInMap("TransitRouterOwnerId")
    public Long transitRouterOwnerId;

    @NameInMap("Version")
    public String version;

    /**
     * <p>The instance ID of the VPC-connected instance.</p>
     * <blockquote>
     * <p>The VpcId and TransitRouterId parameters are mutually exclusive. You must specify one of them.
     * You must first call the CreateVpc operation of the Vpc (2016-04-28) service to create a VPC and obtain the VPC ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1h37fchc6jmfyln****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The Alibaba Cloud account ID to which the VPC-connected instance belongs. Default value: the current logon Alibaba Cloud account ID.</p>
     * <blockquote>
     * <p>If you want to load a network instance across accounts, this parameter is required.</p>
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

    public CreateExpressConnectRouterAssociationRequest setTag(java.util.List<CreateExpressConnectRouterAssociationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateExpressConnectRouterAssociationRequestTag> getTag() {
        return this.tag;
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

    public CreateExpressConnectRouterAssociationRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
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

    public static class CreateExpressConnectRouterAssociationRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. The tag value can be an empty string and can be up to 128 characters in length. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateExpressConnectRouterAssociationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateExpressConnectRouterAssociationRequestTag self = new CreateExpressConnectRouterAssociationRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateExpressConnectRouterAssociationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExpressConnectRouterAssociationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
