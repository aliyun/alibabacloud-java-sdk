// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachDBInstancesRequest extends TeaModel {
    /**
     * <p>The association mode between the scaling group and the database. Valid values:</p>
     * <ul>
     * <li>SecurityIp: The SecurityIp mode. In this mode, the IP addresses of scaled-out instances are automatically added to the IP address whitelist of the database. Currently, only ApsaraDB RDS databases support this mode.</li>
     * <li>SecurityGroup: The security group mode. In this mode, the security group of the scaling configuration is added to the security group whitelist of the database for association and registration.</li>
     * </ul>
     * <p>Default value: SecurityIp.</p>
     * 
     * <strong>example:</strong>
     * <p>SecurityIp</p>
     */
    @NameInMap("AttachMode")
    public String attachMode;

    /**
     * <p>Ensures the idempotence of the request. You can generate a parameter value from your client to ensure that the parameter value is unique across different requests.</p>
     * <p>The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IDs of the RDS instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<String> DBInstances;

    /**
     * <p>Specifies whether to add the private IP addresses of all instances in the current scaling group to the IP address whitelist of the RDS instances when the RDS instances are attached to the scaling group. Valid values:</p>
     * <ul>
     * <li><p>true: Adds the private IP addresses.</p>
     * </li>
     * <li><p>false: Does not add the private IP addresses.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceAttach")
    public Boolean forceAttach;

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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1avr6ensitts3w****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The database type. Valid values:</p>
     * <ul>
     * <li>RDS</li>
     * <li>Redis</li>
     * <li>MongoDB</li>
     * </ul>
     * <p>Default value: RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("Type")
    public String type;

    public static AttachDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDBInstancesRequest self = new AttachDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AttachDBInstancesRequest setAttachMode(String attachMode) {
        this.attachMode = attachMode;
        return this;
    }
    public String getAttachMode() {
        return this.attachMode;
    }

    public AttachDBInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachDBInstancesRequest setDBInstances(java.util.List<String> DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public java.util.List<String> getDBInstances() {
        return this.DBInstances;
    }

    public AttachDBInstancesRequest setForceAttach(Boolean forceAttach) {
        this.forceAttach = forceAttach;
        return this;
    }
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    public AttachDBInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachDBInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachDBInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachDBInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public AttachDBInstancesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
