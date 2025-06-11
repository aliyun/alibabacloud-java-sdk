// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditMetaKnowledgeAssetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssetDescription")
    public String assetDescription;

    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableSchemaName")
    public String tableSchemaName;

    public static EditMetaKnowledgeAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        EditMetaKnowledgeAssetRequest self = new EditMetaKnowledgeAssetRequest();
        return TeaModel.build(map, self);
    }

    public EditMetaKnowledgeAssetRequest setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
        return this;
    }
    public String getAssetDescription() {
        return this.assetDescription;
    }

    public EditMetaKnowledgeAssetRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public EditMetaKnowledgeAssetRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public EditMetaKnowledgeAssetRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public EditMetaKnowledgeAssetRequest setTableSchemaName(String tableSchemaName) {
        this.tableSchemaName = tableSchemaName;
        return this;
    }
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

}
