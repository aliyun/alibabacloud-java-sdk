// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class UpgradeMinorVersionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp108z124a8o7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to upgrade the minor engine version immediately. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The minor engine version is upgraded immediately.</p>
     * </li>
     * <li><p><strong>false</strong>: The minor engine version is upgraded at a specified time or within the maintenance window.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The <strong>UpgradeTime</strong> parameter is required if you want to upgrade the minor engine version at a specified time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpgradeImmediately")
    public Boolean upgradeImmediately;

    /**
     * <p>The time to perform the upgrade. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the ApsaraDB for ClickHouse cluster is upgraded within the maintenance window.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-07T16:38Z</p>
     */
    @NameInMap("UpgradeTime")
    public String upgradeTime;

    /**
     * <p>The minor engine version to which you want to upgrade.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the cluster is upgraded to the latest minor engine version.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1.37.0</p>
     */
    @NameInMap("UpgradeVersion")
    public String upgradeVersion;

    public static UpgradeMinorVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMinorVersionRequest self = new UpgradeMinorVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeMinorVersionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpgradeMinorVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeMinorVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeMinorVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeMinorVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeMinorVersionRequest setUpgradeImmediately(Boolean upgradeImmediately) {
        this.upgradeImmediately = upgradeImmediately;
        return this;
    }
    public Boolean getUpgradeImmediately() {
        return this.upgradeImmediately;
    }

    public UpgradeMinorVersionRequest setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

    public UpgradeMinorVersionRequest setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
        return this;
    }
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

}
