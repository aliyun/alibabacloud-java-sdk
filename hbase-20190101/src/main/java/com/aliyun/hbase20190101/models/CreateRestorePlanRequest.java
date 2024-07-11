// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateRestorePlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RestoreAllTable")
    public Boolean restoreAllTable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RestoreByCopy")
    public Boolean restoreByCopy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-05T05:49:42Z</p>
     */
    @NameInMap("RestoreToDate")
    public String restoreToDate;

    /**
     * <strong>example:</strong>
     * <p>test_ns:test_table/test_ns:test_table2</p>
     */
    @NameInMap("Tables")
    public String tables;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp169l540vc6c****</p>
     */
    @NameInMap("TargetClusterId")
    public String targetClusterId;

    public static CreateRestorePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestorePlanRequest self = new CreateRestorePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestorePlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateRestorePlanRequest setRestoreAllTable(Boolean restoreAllTable) {
        this.restoreAllTable = restoreAllTable;
        return this;
    }
    public Boolean getRestoreAllTable() {
        return this.restoreAllTable;
    }

    public CreateRestorePlanRequest setRestoreByCopy(Boolean restoreByCopy) {
        this.restoreByCopy = restoreByCopy;
        return this;
    }
    public Boolean getRestoreByCopy() {
        return this.restoreByCopy;
    }

    public CreateRestorePlanRequest setRestoreToDate(String restoreToDate) {
        this.restoreToDate = restoreToDate;
        return this;
    }
    public String getRestoreToDate() {
        return this.restoreToDate;
    }

    public CreateRestorePlanRequest setTables(String tables) {
        this.tables = tables;
        return this;
    }
    public String getTables() {
        return this.tables;
    }

    public CreateRestorePlanRequest setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

}
