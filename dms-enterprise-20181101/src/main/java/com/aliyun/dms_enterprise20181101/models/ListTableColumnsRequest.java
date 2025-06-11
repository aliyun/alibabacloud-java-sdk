// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTableColumnsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100g_customer</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>dbo</p>
     */
    @NameInMap("TableSchemaName")
    public String tableSchemaName;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTableColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableColumnsRequest self = new ListTableColumnsRequest();
        return TeaModel.build(map, self);
    }

    public ListTableColumnsRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public ListTableColumnsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListTableColumnsRequest setTableSchemaName(String tableSchemaName) {
        this.tableSchemaName = tableSchemaName;
        return this;
    }
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

    public ListTableColumnsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
