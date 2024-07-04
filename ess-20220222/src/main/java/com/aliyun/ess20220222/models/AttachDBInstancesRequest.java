// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachDBInstancesRequest extends TeaModel {
    /**
     * <p>The mode in which you want to attach the ApsaraDB RDS instance to the scaling group. Valid values:</p>
     * <ul>
     * <li>SecurityIp: the SecurityIp mode. Auto Scaling automatically adds the private IP addresses of the scaled out instances to the IP address whitelist of the ApsaraDB RDS instance. You can select this mode only when you attach an ApsaraDB RDS instance to a scaling group.</li>
     * <li>SecurityGroup: the security group mode. Auto Scaling adds the security group of the scaling configuration to the security group whitelist for registration and association.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SecurityIp</p>
     */
    @NameInMap("AttachMode")
    public String attachMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests.</p>
     * <p>The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure the idempotence of a request</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the ApsaraDB RDS instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<String> DBInstances;

    /**
     * <p>Specifies whether to add the private IP addresses of all instances in the scaling group to the IP address whitelist of the ApsaraDB RDS instance. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
     * <p>The type of the database that you want to attach to the scaling group. Valid values:</p>
     * <ul>
     * <li>ApsaraDB RDS</li>
     * <li>ApsaraDB for Redis</li>
     * <li>ApsaraDB for MongoDB</li>
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
