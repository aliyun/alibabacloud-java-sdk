// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyFullTableScanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FullTableScan")
    public Boolean fullTableScan;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableNames")
    public String tableNames;

    public static ModifyFullTableScanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullTableScanRequest self = new ModifyFullTableScanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFullTableScanRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyFullTableScanRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyFullTableScanRequest setFullTableScan(Boolean fullTableScan) {
        this.fullTableScan = fullTableScan;
        return this;
    }
    public Boolean getFullTableScan() {
        return this.fullTableScan;
    }

    public ModifyFullTableScanRequest setTableNames(String tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public String getTableNames() {
        return this.tableNames;
    }

}
