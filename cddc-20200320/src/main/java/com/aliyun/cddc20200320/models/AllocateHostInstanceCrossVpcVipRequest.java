// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class AllocateHostInstanceCrossVpcVipRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("Port")
    public String port;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("BindVpcId")
    public String bindVpcId;

    @NameInMap("BindVSwitchId")
    public String bindVSwitchId;

    @NameInMap("RegionId")
    public String regionId;

    public static AllocateHostInstanceCrossVpcVipRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateHostInstanceCrossVpcVipRequest self = new AllocateHostInstanceCrossVpcVipRequest();
        return TeaModel.build(map, self);
    }

    public AllocateHostInstanceCrossVpcVipRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateHostInstanceCrossVpcVipRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateHostInstanceCrossVpcVipRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateHostInstanceCrossVpcVipRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public AllocateHostInstanceCrossVpcVipRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public AllocateHostInstanceCrossVpcVipRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public AllocateHostInstanceCrossVpcVipRequest setBindVpcId(String bindVpcId) {
        this.bindVpcId = bindVpcId;
        return this;
    }
    public String getBindVpcId() {
        return this.bindVpcId;
    }

    public AllocateHostInstanceCrossVpcVipRequest setBindVSwitchId(String bindVSwitchId) {
        this.bindVSwitchId = bindVSwitchId;
        return this;
    }
    public String getBindVSwitchId() {
        return this.bindVSwitchId;
    }

    public AllocateHostInstanceCrossVpcVipRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
