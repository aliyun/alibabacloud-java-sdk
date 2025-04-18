// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateElasticNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>The POP API is not ignored by default and is used for idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>3fd79d62-ab1d-11ec-9a53-0242ac110004</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Whether to enable the jumbo frame capability</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>The ID of the Lingjun node.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-lbj3aej****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-wz9fj2s3o21nw2****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-t4nahb0pxck****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * <blockquote>
     * <p> If the NodeId parameter is empty, the VpcId parameter is required. If the NodeId parameter is not empty, the VpcId parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6aa4ddo97fr****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateElasticNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticNetworkInterfaceRequest self = new CreateElasticNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticNetworkInterfaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateElasticNetworkInterfaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateElasticNetworkInterfaceRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public CreateElasticNetworkInterfaceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateElasticNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateElasticNetworkInterfaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateElasticNetworkInterfaceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateElasticNetworkInterfaceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateElasticNetworkInterfaceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateElasticNetworkInterfaceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
