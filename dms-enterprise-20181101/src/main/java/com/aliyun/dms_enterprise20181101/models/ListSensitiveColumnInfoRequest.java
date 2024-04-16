// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnInfoRequest extends TeaModel {
    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("InstanceId")
    public Integer instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Tid")
    public Long tid;

    public static ListSensitiveColumnInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnInfoRequest self = new ListSensitiveColumnInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnInfoRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListSensitiveColumnInfoRequest setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Integer getInstanceId() {
        return this.instanceId;
    }

    public ListSensitiveColumnInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSensitiveColumnInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSensitiveColumnInfoRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ListSensitiveColumnInfoRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListSensitiveColumnInfoRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
