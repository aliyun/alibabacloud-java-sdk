// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvBaseTableDetailModel extends TeaModel {
    @NameInMap("DataVolumn")
    public String dataVolumn;

    @NameInMap("EnableBinlog")
    public Boolean enableBinlog;

    @NameInMap("SchemaName")
    public String schemaName;

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
