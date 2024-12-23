// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsTableResponseBody extends TeaModel {
    @NameInMap("data")
    public GetMmsTableResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>E7FB14F1-4ACD-5C73-A755-B302D70AB9AD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsTableResponseBody self = new GetMmsTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsTableResponseBody setData(GetMmsTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsTableResponseBodyData getData() {
        return this.data;
    }

    public GetMmsTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsTableResponseBodyDataSchemaColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>user id</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("nullable")
        public Boolean nullable;

        /**
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMmsTableResponseBodyDataSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            GetMmsTableResponseBodyDataSchemaColumns self = new GetMmsTableResponseBodyDataSchemaColumns();
            return TeaModel.build(map, self);
        }

        public GetMmsTableResponseBodyDataSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMmsTableResponseBodyDataSchemaColumns setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetMmsTableResponseBodyDataSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsTableResponseBodyDataSchemaColumns setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetMmsTableResponseBodyDataSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMmsTableResponseBodyDataSchemaPartitions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>first partition level</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>p1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("nullable")
        public Boolean nullable;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMmsTableResponseBodyDataSchemaPartitions build(java.util.Map<String, ?> map) throws Exception {
            GetMmsTableResponseBodyDataSchemaPartitions self = new GetMmsTableResponseBodyDataSchemaPartitions();
            return TeaModel.build(map, self);
        }

        public GetMmsTableResponseBodyDataSchemaPartitions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMmsTableResponseBodyDataSchemaPartitions setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetMmsTableResponseBodyDataSchemaPartitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsTableResponseBodyDataSchemaPartitions setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetMmsTableResponseBodyDataSchemaPartitions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMmsTableResponseBodyDataSchema extends TeaModel {
        @NameInMap("columns")
        public java.util.List<GetMmsTableResponseBodyDataSchemaColumns> columns;

        /**
         * <strong>example:</strong>
         * <p>for mms test</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("partitions")
        public java.util.List<GetMmsTableResponseBodyDataSchemaPartitions> partitions;

        public static GetMmsTableResponseBodyDataSchema build(java.util.Map<String, ?> map) throws Exception {
            GetMmsTableResponseBodyDataSchema self = new GetMmsTableResponseBodyDataSchema();
            return TeaModel.build(map, self);
        }

        public GetMmsTableResponseBodyDataSchema setColumns(java.util.List<GetMmsTableResponseBodyDataSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetMmsTableResponseBodyDataSchemaColumns> getColumns() {
            return this.columns;
        }

        public GetMmsTableResponseBodyDataSchema setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMmsTableResponseBodyDataSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsTableResponseBodyDataSchema setPartitions(java.util.List<GetMmsTableResponseBodyDataSchemaPartitions> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.List<GetMmsTableResponseBodyDataSchemaPartitions> getPartitions() {
            return this.partitions;
        }

    }

    public static class GetMmsTableResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("dbId")
        public Long dbId;

        /**
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("dbName")
        public String dbName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;mapkey.delim&quot;:&quot;:&quot;,&quot;collection.delim&quot;:&quot;,&quot;,&quot;serialization.format&quot;:&quot;|&quot;,&quot;field.delim&quot;:&quot;|&quot;}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasPartitions")
        public Boolean hasPartitions;

        /**
         * <p>table ID</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>inputFormat</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
         */
        @NameInMap("inputFormat")
        public String inputFormat;

        /**
         * <p>lastDdlTime</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:42</p>
         */
        @NameInMap("lastDdlTime")
        public String lastDdlTime;

        /**
         * <strong>example:</strong>
         * <p>| hdfs://master-1-1.c-c127cd184bb029ea.cn-zhangjiakou.emr.aliyuncs.com:9000/user/hive/warehouse/demo</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>233232</p>
         */
        @NameInMap("numRows")
        public Long numRows;

        /**
         * <p>outputFormat</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat</p>
         */
        @NameInMap("outputFormat")
        public String outputFormat;

        /**
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("partitions")
        public Integer partitions;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("partitionsDoing")
        public Integer partitionsDoing;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("partitionsDone")
        public Integer partitionsDone;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("partitionsFailed")
        public Integer partitionsFailed;

        @NameInMap("schema")
        public GetMmsTableResponseBodyDataSchema schema;

        /**
         * <p>serde</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe</p>
         */
        @NameInMap("serde")
        public String serde;

        /**
         * <strong>example:</strong>
         * <p>23232</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>2000028</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("sourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>MANAGED_TABLED</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("updated")
        public Boolean updated;

        public static GetMmsTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsTableResponseBodyData self = new GetMmsTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsTableResponseBodyData setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetMmsTableResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetMmsTableResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetMmsTableResponseBodyData setHasPartitions(Boolean hasPartitions) {
            this.hasPartitions = hasPartitions;
            return this;
        }
        public Boolean getHasPartitions() {
            return this.hasPartitions;
        }

        public GetMmsTableResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsTableResponseBodyData setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public GetMmsTableResponseBodyData setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMmsTableResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMmsTableResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsTableResponseBodyData setNumRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }
        public Long getNumRows() {
            return this.numRows;
        }

        public GetMmsTableResponseBodyData setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public GetMmsTableResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetMmsTableResponseBodyData setPartitions(Integer partitions) {
            this.partitions = partitions;
            return this;
        }
        public Integer getPartitions() {
            return this.partitions;
        }

        public GetMmsTableResponseBodyData setPartitionsDoing(Integer partitionsDoing) {
            this.partitionsDoing = partitionsDoing;
            return this;
        }
        public Integer getPartitionsDoing() {
            return this.partitionsDoing;
        }

        public GetMmsTableResponseBodyData setPartitionsDone(Integer partitionsDone) {
            this.partitionsDone = partitionsDone;
            return this;
        }
        public Integer getPartitionsDone() {
            return this.partitionsDone;
        }

        public GetMmsTableResponseBodyData setPartitionsFailed(Integer partitionsFailed) {
            this.partitionsFailed = partitionsFailed;
            return this;
        }
        public Integer getPartitionsFailed() {
            return this.partitionsFailed;
        }

        public GetMmsTableResponseBodyData setSchema(GetMmsTableResponseBodyDataSchema schema) {
            this.schema = schema;
            return this;
        }
        public GetMmsTableResponseBodyDataSchema getSchema() {
            return this.schema;
        }

        public GetMmsTableResponseBodyData setSerde(String serde) {
            this.serde = serde;
            return this;
        }
        public String getSerde() {
            return this.serde;
        }

        public GetMmsTableResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetMmsTableResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetMmsTableResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public GetMmsTableResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMmsTableResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMmsTableResponseBodyData setUpdated(Boolean updated) {
            this.updated = updated;
            return this;
        }
        public Boolean getUpdated() {
            return this.updated;
        }

    }

}
