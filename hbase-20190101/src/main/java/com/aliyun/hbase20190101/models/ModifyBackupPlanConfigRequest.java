// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanConfigRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("FullBackupCycle")
    public String fullBackupCycle;

    @NameInMap("MinHFileBackupCount")
    public String minHFileBackupCount;

    @NameInMap("NextFullBackupDate")
    public String nextFullBackupDate;

    @NameInMap("Tables")
    public String tables;

    public static ModifyBackupPlanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanConfigRequest self = new ModifyBackupPlanConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyBackupPlanConfigRequest setFullBackupCycle(String fullBackupCycle) {
        this.fullBackupCycle = fullBackupCycle;
        return this;
    }
    public String getFullBackupCycle() {
        return this.fullBackupCycle;
    }

    public ModifyBackupPlanConfigRequest setMinHFileBackupCount(String minHFileBackupCount) {
        this.minHFileBackupCount = minHFileBackupCount;
        return this;
    }
    public String getMinHFileBackupCount() {
        return this.minHFileBackupCount;
    }

    public ModifyBackupPlanConfigRequest setNextFullBackupDate(String nextFullBackupDate) {
        this.nextFullBackupDate = nextFullBackupDate;
        return this;
    }
    public String getNextFullBackupDate() {
        return this.nextFullBackupDate;
    }

    public ModifyBackupPlanConfigRequest setTables(String tables) {
        this.tables = tables;
        return this;
    }
    public String getTables() {
        return this.tables;
    }

}
