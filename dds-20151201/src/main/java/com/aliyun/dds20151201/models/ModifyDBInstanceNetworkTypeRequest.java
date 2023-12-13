// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeRequest extends TeaModel {
    /**
     * <p>The retention period of the original classic network address when you change the network type to VPC. Valid values: **14**, **30**, **60**, and **120**. Unit: days.</p>
     * <br>
     * <p>> This parameter is required when the **NetworkType** parameter is set to **VPC** and the **RetainClassic** parameter is set to **True**.</p>
     */
    @NameInMap("ClassicExpiredDays")
    public Integer classicExpiredDays;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type to switch to. Valid value:</p>
     * <br>
     * <p>*   **VPC**</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to retain the original classic network address when you change the network type to VPC. Valid values:</p>
     * <br>
     * <p>*   **True**: retains the original classic network address.</p>
     * <p>*   **False**: does not retain the original classic network address.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is required when the **NetworkType** parameter is set to **VPC**.</p>
     * <br>
     * <p>*   If you set this parameter to **True**, you must also specify the **ClassicExpiredDays** parameter.</p>
     */
    @NameInMap("RetainClassic")
    public String retainClassic;

    /**
     * <p>The ID of the vSwitch in the VPC.</p>
     * <br>
     * <p>> This parameter is required when the **NetworkType** parameter is set to **VPC**.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * <br>
     * <p>> This parameter is required when the **NetworkType** parameter is set to **VPC**.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>可用区ID，您可以通过调用[DescribeRegions](~~61933~~)接口查询可用区ID。</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ModifyDBInstanceNetworkTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkTypeRequest self = new ModifyDBInstanceNetworkTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetworkTypeRequest setClassicExpiredDays(Integer classicExpiredDays) {
        this.classicExpiredDays = classicExpiredDays;
        return this;
    }
    public Integer getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    public ModifyDBInstanceNetworkTypeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceNetworkTypeRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ModifyDBInstanceNetworkTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceNetworkTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceNetworkTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceNetworkTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceNetworkTypeRequest setRetainClassic(String retainClassic) {
        this.retainClassic = retainClassic;
        return this;
    }
    public String getRetainClassic() {
        return this.retainClassic;
    }

    public ModifyDBInstanceNetworkTypeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyDBInstanceNetworkTypeRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ModifyDBInstanceNetworkTypeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
