// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ColumnKnowledgeInfo extends TeaModel {
    /**
     * <p>User-edited business knowledge content, which can be modified via the EditMetaKnowledgeAsset API.</p>
     */
    @NameInMap("AssetDescription")
    public String assetDescription;

    /**
     * <p>The last modified time of the field.</p>
     */
    @NameInMap("AssetModifiedGmt")
    public String assetModifiedGmt;

    /**
     * <p>The name of the field.</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The data type of the field.</p>
     */
    @NameInMap("ColumnType")
    public String columnType;

    /**
     * <p>Field description in the CREATE TABLE statement.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The field order in the CREATE TABLE statement.</p>
     */
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
