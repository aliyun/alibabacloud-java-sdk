// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDataKeyVO extends TeaModel {
    @NameInMap("ColName")
    public String colName;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("MekId")
    public Long mekId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TblName")
    public String tblName;

    @NameInMap("UserName")
    public String userName;

    public static GetTableDataKeyVO build(java.util.Map<String, ?> map) throws Exception {
        GetTableDataKeyVO self = new GetTableDataKeyVO();
        return TeaModel.build(map, self);
    }

    public GetTableDataKeyVO setColName(String colName) {
        this.colName = colName;
        return this;
    }
    public String getColName() {
        return this.colName;
    }

    public GetTableDataKeyVO setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetTableDataKeyVO setMekId(Long mekId) {
        this.mekId = mekId;
        return this;
    }
    public Long getMekId() {
        return this.mekId;
    }

    public GetTableDataKeyVO setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public GetTableDataKeyVO setTblName(String tblName) {
        this.tblName = tblName;
        return this;
    }
    public String getTblName() {
        return this.tblName;
    }

    public GetTableDataKeyVO setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
