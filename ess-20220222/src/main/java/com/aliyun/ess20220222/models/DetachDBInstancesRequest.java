// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachDBInstancesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IDs of the ApsaraDB RDS instances. You can remove up to five ApsaraDB RDS instances at a time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<String> DBInstances;

    /**
     * <p>Specifies whether to remove the private IP addresses of the instances in the scaling group from the IP whitelist of the RDS instance. Valid values:</p>
     * <ul>
     * <li><p>true: removes the private IP addresses of the instances.</p>
     * </li>
     * <li><p>false: does not remove the private IP addresses of the instances.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceDetach")
    public Boolean forceDetach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is valid only for databases whose <code>AttachMode</code> is set to <code>SecurityGroup</code>. Valid values:</p>
     * <ul>
     * <li>true: removes the security group ID that was added when the scaling group was associated with the database.</li>
     * <li>false: retains the security group ID that was added when the scaling group was associated with the database.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RemoveSecurityGroup")
    public Boolean removeSecurityGroup;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DetachDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDBInstancesRequest self = new DetachDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DetachDBInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachDBInstancesRequest setDBInstances(java.util.List<String> DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public java.util.List<String> getDBInstances() {
        return this.DBInstances;
    }

    public DetachDBInstancesRequest setForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
        return this;
    }
    public Boolean getForceDetach() {
        return this.forceDetach;
    }

    public DetachDBInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachDBInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachDBInstancesRequest setRemoveSecurityGroup(Boolean removeSecurityGroup) {
        this.removeSecurityGroup = removeSecurityGroup;
        return this;
    }
    public Boolean getRemoveSecurityGroup() {
        return this.removeSecurityGroup;
    }

    public DetachDBInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachDBInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
