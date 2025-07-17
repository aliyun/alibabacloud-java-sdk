// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddTableToCategoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000254257</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1930****</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
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

    public static AddTableToCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTableToCategoryRequest self = new AddTableToCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddTableToCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public AddTableToCategoryRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public AddTableToCategoryRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public AddTableToCategoryRequest setTableSchemaName(String tableSchemaName) {
        this.tableSchemaName = tableSchemaName;
        return this;
    }
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

    public AddTableToCategoryRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
