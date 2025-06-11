// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class TableKnowledgeInfo extends TeaModel {
    @NameInMap("AssetDescription")
    public String assetDescription;

    @NameInMap("AssetModifiedGmt")
    public String assetModifiedGmt;

    @NameInMap("ColumnList")
    public java.util.List<ColumnKnowledgeInfo> columnList;

    @NameInMap("Description")
    public String description;

    @NameInMap("Summary")
    public String summary;

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
