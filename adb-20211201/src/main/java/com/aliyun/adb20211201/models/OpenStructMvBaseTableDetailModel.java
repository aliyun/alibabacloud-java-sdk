// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvBaseTableDetailModel extends TeaModel {
    /**
     * <p>The data volume.</p>
     * 
     * <strong>example:</strong>
     * <p>321233</p>
     */
    @NameInMap("DataVolumn")
    public String dataVolumn;

    /**
     * <p>Indicates whether binary logging is enabled for the table.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBinlog")
    public Boolean enableBinlog;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static OpenStructMvBaseTableDetailModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructMvBaseTableDetailModel self = new OpenStructMvBaseTableDetailModel();
        return TeaModel.build(map, self);
    }

    public OpenStructMvBaseTableDetailModel setDataVolumn(String dataVolumn) {
        this.dataVolumn = dataVolumn;
        return this;
    }
    public String getDataVolumn() {
        return this.dataVolumn;
    }

    public OpenStructMvBaseTableDetailModel setEnableBinlog(Boolean enableBinlog) {
        this.enableBinlog = enableBinlog;
        return this;
    }
    public Boolean getEnableBinlog() {
        return this.enableBinlog;
    }

    public OpenStructMvBaseTableDetailModel setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public OpenStructMvBaseTableDetailModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
