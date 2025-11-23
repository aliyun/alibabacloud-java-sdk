// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditMetaKnowledgeAssetRequest extends TeaModel {
    /**
     * <p>Business knowledge content edited by users.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AssetDescription")
    public String assetDescription;

    /**
     * <p>The name of the field. This parameter is used when the edited content is a field.</p>
     * 
     * <strong>example:</strong>
     * <p>test_column</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The ID of the physical database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1930****</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The schema name of the table, which is required only for SQL Server instances.</p>
     * 
     * <strong>example:</strong>
     * <p>dbo</p>
     */
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
