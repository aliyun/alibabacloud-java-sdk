// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkOptionsRequest extends TeaModel {
    /**
     * <p>The bandwidth weight.</p>
     * <p>The supported values vary with instance types. You can query the bandwidth weights supported by the current instance type by using the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Vpc-L1: Vpc-L1.</li>
     * <li>Vpc-L2: Vpc-L2.</li>
     * <li>Ebs-L1: Ebs-L1.</li>
     * <li>Ebs-L2: Ebs-L2.</li>
     * <li>Default: the Default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Vpc-L1</p>
     */
    @NameInMap("BandwidthWeighting")
    public String bandwidthWeighting;

    /**
     * <p>The ID of the instance whose network bandwidth weight is to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceNetworkOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkOptionsRequest self = new ModifyInstanceNetworkOptionsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkOptionsRequest setBandwidthWeighting(String bandwidthWeighting) {
        this.bandwidthWeighting = bandwidthWeighting;
        return this;
    }
    public String getBandwidthWeighting() {
        return this.bandwidthWeighting;
    }

    public ModifyInstanceNetworkOptionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNetworkOptionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceNetworkOptionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceNetworkOptionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
