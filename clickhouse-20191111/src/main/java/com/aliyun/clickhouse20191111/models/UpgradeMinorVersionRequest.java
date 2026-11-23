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
     * <li><p><strong>true</strong>: Upgrades the minor engine version immediately.</p>
     * </li>
     * <li><p><strong>false</strong>: Upgrades the minor engine version at a specified time or during the maintenance window.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you specify a time to upgrade the minor engine version, <strong>UpgradeTime</strong> is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpgradeImmediately")
    public Boolean upgradeImmediately;

    /**
     * <p>The specified upgrade time. Format: yyyy-MM-ddTHH:mmZ (UTC time).</p>
     * <blockquote>
     * <p>If this parameter is left empty, the ApsaraDB for ClickHouse cluster performs a minor kernel version upgrade during the maintenance window.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-07T16:38Z</p>
     */
    @NameInMap("UpgradeTime")
    public String upgradeTime;

    /**
     * <p>The target minor engine version.</p>
     * <blockquote>
     * <p>By default, this parameter is left empty, and the minor engine version is upgraded to the latest version.</p>
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
