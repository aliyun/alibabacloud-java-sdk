// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ColumnKnowledgeInfo extends TeaModel {
    @NameInMap("AssetDescription")
    public String assetDescription;

    @NameInMap("AssetModifiedGmt")
    public String assetModifiedGmt;

    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("ColumnType")
    public String columnType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Position")
    public Integer position;

    public static ColumnKnowledgeInfo build(java.util.Map<String, ?> map) throws Exception {
        ColumnKnowledgeInfo self = new ColumnKnowledgeInfo();
        return TeaModel.build(map, self);
    }

    public ColumnKnowledgeInfo setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
        return this;
    }
    public String getAssetDescription() {
        return this.assetDescription;
    }

    public ColumnKnowledgeInfo setAssetModifiedGmt(String assetModifiedGmt) {
        this.assetModifiedGmt = assetModifiedGmt;
        return this;
    }
    public String getAssetModifiedGmt() {
        return this.assetModifiedGmt;
    }

    public ColumnKnowledgeInfo setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ColumnKnowledgeInfo setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }
    public String getColumnType() {
        return this.columnType;
    }

    public ColumnKnowledgeInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ColumnKnowledgeInfo setPosition(Integer position) {
        this.position = position;
        return this;
    }
    public Integer getPosition() {
        return this.position;
    }

}
