// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-m5eznlga4k5bcxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("FullBackupCycle")
    public String fullBackupCycle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinHFileBackupCount")
    public String minHFileBackupCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T18:00:00Z</p>
     */
    @NameInMap("NextFullBackupDate")
    public String nextFullBackupDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
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
