// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class MigrateDBClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>dns</p>
     */
    @NameInMap("LinkSwitchMode")
    public String linkSwitchMode;

    @NameInMap("NewShardNumber")
    public Long newShardNumber;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    @NameInMap("SwitchTimeMode")
    public Long switchTimeMode;

    public static MigrateDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBClusterRequest self = new MigrateDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public MigrateDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public MigrateDBClusterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public MigrateDBClusterRequest setLinkSwitchMode(String linkSwitchMode) {
        this.linkSwitchMode = linkSwitchMode;
        return this;
    }
    public String getLinkSwitchMode() {
        return this.linkSwitchMode;
    }

    public MigrateDBClusterRequest setNewShardNumber(Long newShardNumber) {
        this.newShardNumber = newShardNumber;
        return this;
    }
    public Long getNewShardNumber() {
        return this.newShardNumber;
    }

    public MigrateDBClusterRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public MigrateDBClusterRequest setSwitchTimeMode(Long switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public Long getSwitchTimeMode() {
        return this.switchTimeMode;
    }

}
