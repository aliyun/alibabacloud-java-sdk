// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class UpgradeMinorVersionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
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
     * <p>Specifies whether to update the minor engine version of the ApsaraDB for ClickHouse cluster immediately. Valid values:</p>
     * <br>
     * <p>*   **true**: updates the minor engine version of the ApsaraDB for ClickHouse cluster immediately.</p>
     * <p>*   **false**: updates the minor engine version of the ApsaraDB for ClickHouse cluster at the specified time or within the specified maintenance window.</p>
     * <br>
     * <p>>  If you want to update the minor engine version of the ApsaraDB for ClickHouse cluster at the specified time, **UpgradeTime** is required.</p>
     */
    @NameInMap("UpgradeImmediately")
    public Boolean upgradeImmediately;

    /**
     * <p>The update time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in Coordinated Universal Time (UTC).</p>
     * <br>
     * <p>>  If you do not set this parameter, the minor engine version of an ApsaraDB for ClickHouse cluster is updated within the specified maintenance window.</p>
     */
    @NameInMap("UpgradeTime")
    public String upgradeTime;

    /**
     * <p>The minor engine version to which you want to update.</p>
     * <br>
     * <p>>  By default, UpgradeVersion is not set and the minor engine version of the ApsaraDB for ClickHouse cluster is updated to the latest version.</p>
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
