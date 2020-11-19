// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DeleteShardTasksRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("TableName")
    @Validation(required = true)
    public java.util.List<DeleteShardTasksRequestTableName> tableName;

    public static DeleteShardTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteShardTasksRequest self = new DeleteShardTasksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteShardTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteShardTasksRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DeleteShardTasksRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DeleteShardTasksRequest setTableName(java.util.List<DeleteShardTasksRequestTableName> tableName) {
        this.tableName = tableName;
        return this;
    }
    public java.util.List<DeleteShardTasksRequestTableName> getTableName() {
        return this.tableName;
    }

    public static class DeleteShardTasksRequestTableName extends TeaModel {
        @NameInMap("SourceTableName")
        public String sourceTableName;

        @NameInMap("TargetTableName")
        public String targetTableName;

        public static DeleteShardTasksRequestTableName build(java.util.Map<String, ?> map) throws Exception {
            DeleteShardTasksRequestTableName self = new DeleteShardTasksRequestTableName();
            return TeaModel.build(map, self);
        }

        public DeleteShardTasksRequestTableName setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public DeleteShardTasksRequestTableName setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

    }

}
