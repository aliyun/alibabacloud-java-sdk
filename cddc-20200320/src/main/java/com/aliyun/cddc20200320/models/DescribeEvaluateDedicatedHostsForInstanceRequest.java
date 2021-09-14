// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeEvaluateDedicatedHostsForInstanceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ExcludeType")
    public String excludeType;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    public static DescribeEvaluateDedicatedHostsForInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateDedicatedHostsForInstanceRequest self = new DescribeEvaluateDedicatedHostsForInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setExcludeType(String excludeType) {
        this.excludeType = excludeType;
        return this;
    }
    public String getExcludeType() {
        return this.excludeType;
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeEvaluateDedicatedHostsForInstanceRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

}
