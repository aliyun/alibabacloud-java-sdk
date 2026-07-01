// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp16qstyvxj9gpqw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The index of the network card specified for the ENI.</p>
     * <blockquote>
     * <p>Valid values of NetworkCardIndex depend on the instance family. If the instance type does not support network cards, you cannot specify this parameter. If the instance type supports network cards, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> for valid values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NetworkCardIndex")
    public Integer networkCardIndex;

    /**
     * <p>The network interface controller (NIC) ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp17pdijfczax1huji****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the trunk ENI.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eni-f8zapqwj1v1j4ia3****</p>
     */
    @NameInMap("TrunkNetworkInstanceId")
    public String trunkNetworkInstanceId;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("WaitForNetworkConfigurationReady")
    public Boolean waitForNetworkConfigurationReady;

    public static AttachNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkInterfaceRequest self = new AttachNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public AttachNetworkInterfaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachNetworkInterfaceRequest setNetworkCardIndex(Integer networkCardIndex) {
        this.networkCardIndex = networkCardIndex;
        return this;
    }
    public Integer getNetworkCardIndex() {
        return this.networkCardIndex;
    }

    public AttachNetworkInterfaceRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AttachNetworkInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AttachNetworkInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachNetworkInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachNetworkInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AttachNetworkInterfaceRequest setTrunkNetworkInstanceId(String trunkNetworkInstanceId) {
        this.trunkNetworkInstanceId = trunkNetworkInstanceId;
        return this;
    }
    public String getTrunkNetworkInstanceId() {
        return this.trunkNetworkInstanceId;
    }

    public AttachNetworkInterfaceRequest setWaitForNetworkConfigurationReady(Boolean waitForNetworkConfigurationReady) {
        this.waitForNetworkConfigurationReady = waitForNetworkConfigurationReady;
        return this;
    }
    public Boolean getWaitForNetworkConfigurationReady() {
        return this.waitForNetworkConfigurationReady;
    }

}
