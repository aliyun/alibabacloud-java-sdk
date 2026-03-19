// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class TableKnowledgeInfo extends TeaModel {
    /**
     * <p>Table usage instructions, which are not editable in OpenAPI.</p>
     */
    @NameInMap("AssetDescription")
    public String assetDescription;

    /**
     * <p>Last modified time.</p>
     */
    @NameInMap("AssetModifiedGmt")
    public String assetModifiedGmt;

    /**
     * <p>The columns of the table.</p>
     */
    @NameInMap("ColumnList")
    public java.util.List<ColumnKnowledgeInfo> columnList;

    /**
     * <p>Table description in the CREAT TABLE statement.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Table business description, which can be edited via EditMetaKnowledgeAsset.</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>The table name.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static TableKnowledgeInfo build(java.util.Map<String, ?> map) throws Exception {
        TableKnowledgeInfo self = new TableKnowledgeInfo();
        return TeaModel.build(map, self);
    }

    public TableKnowledgeInfo setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
        return this;
    }
    public String getAssetDescription() {
        return this.assetDescription;
    }

    public TableKnowledgeInfo setAssetModifiedGmt(String assetModifiedGmt) {
        this.assetModifiedGmt = assetModifiedGmt;
        return this;
    }
    public String getAssetModifiedGmt() {
        return this.assetModifiedGmt;
    }

    public TableKnowledgeInfo setColumnList(java.util.List<ColumnKnowledgeInfo> columnList) {
        this.columnList = columnList;
        return this;
    }
    public java.util.List<ColumnKnowledgeInfo> getColumnList() {
        return this.columnList;
    }

    public TableKnowledgeInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TableKnowledgeInfo setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public TableKnowledgeInfo setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
