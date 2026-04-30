// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class TableInstructionsVO extends TeaModel {
    @NameInMap("AssetCreatedGmt")
    public String assetCreatedGmt;

    @NameInMap("AssetDescription")
    public String assetDescription;

    @NameInMap("AssetModifiedGmt")
    public String assetModifiedGmt;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("TableName")
    public String tableName;

    public static TableInstructionsVO build(java.util.Map<String, ?> map) throws Exception {
        TableInstructionsVO self = new TableInstructionsVO();
        return TeaModel.build(map, self);
    }

    public TableInstructionsVO setAssetCreatedGmt(String assetCreatedGmt) {
        this.assetCreatedGmt = assetCreatedGmt;
        return this;
    }
    public String getAssetCreatedGmt() {
        return this.assetCreatedGmt;
    }

    public TableInstructionsVO setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
        return this;
    }
    public String getAssetDescription() {
        return this.assetDescription;
    }

    public TableInstructionsVO setAssetModifiedGmt(String assetModifiedGmt) {
        this.assetModifiedGmt = assetModifiedGmt;
        return this;
    }
    public String getAssetModifiedGmt() {
        return this.assetModifiedGmt;
    }

    public TableInstructionsVO setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public TableInstructionsVO setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public TableInstructionsVO setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public TableInstructionsVO setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
