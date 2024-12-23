// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTablesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListMmsTablesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>E7FB14F1-4ACD-5C73-A755-B302D70AB9AD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTablesResponseBody self = new ListMmsTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsTablesResponseBody setData(ListMmsTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMmsTablesResponseBodyData getData() {
        return this.data;
    }

    public ListMmsTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsTablesResponseBodyDataObjectListSchemaColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>user id</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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

        public static ListMmsTablesResponseBodyDataObjectListSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTablesResponseBodyDataObjectListSchemaColumns self = new ListMmsTablesResponseBodyDataObjectListSchemaColumns();
            return TeaModel.build(map, self);
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaColumns setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaColumns setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMmsTablesResponseBodyDataObjectListSchemaPartitions extends TeaModel {
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

        public static ListMmsTablesResponseBodyDataObjectListSchemaPartitions build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTablesResponseBodyDataObjectListSchemaPartitions self = new ListMmsTablesResponseBodyDataObjectListSchemaPartitions();
            return TeaModel.build(map, self);
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaPartitions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaPartitions setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaPartitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaPartitions setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ListMmsTablesResponseBodyDataObjectListSchemaPartitions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMmsTablesResponseBodyDataObjectListSchema extends TeaModel {
        @NameInMap("columns")
        public java.util.List<ListMmsTablesResponseBodyDataObjectListSchemaColumns> columns;

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
        public java.util.List<ListMmsTablesResponseBodyDataObjectListSchemaPartitions> partitions;

        public static ListMmsTablesResponseBodyDataObjectListSchema build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTablesResponseBodyDataObjectListSchema self = new ListMmsTablesResponseBodyDataObjectListSchema();
            return TeaModel.build(map, self);
        }

        public ListMmsTablesResponseBodyDataObjectListSchema setColumns(java.util.List<ListMmsTablesResponseBodyDataObjectListSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ListMmsTablesResponseBodyDataObjectListSchemaColumns> getColumns() {
            return this.columns;
        }

        public ListMmsTablesResponseBodyDataObjectListSchema setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListMmsTablesResponseBodyDataObjectListSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsTablesResponseBodyDataObjectListSchema setPartitions(java.util.List<ListMmsTablesResponseBodyDataObjectListSchemaPartitions> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.List<ListMmsTablesResponseBodyDataObjectListSchemaPartitions> getPartitions() {
            return this.partitions;
        }

    }

    public static class ListMmsTablesResponseBodyDataObjectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>196</p>
         */
        @NameInMap("dbId")
        public Long dbId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
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
         * <p>1003476</p>
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
         * <p>232323</p>
         */
        @NameInMap("numRows")
        public Long numRows;

        /**
         * <p>outFormat</p>
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
         * <p>60</p>
         */
        @NameInMap("partitionsDone")
        public Integer partitionsDone;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("partitionsFailed")
        public Integer partitionsFailed;

        @NameInMap("schema")
        public ListMmsTablesResponseBodyDataObjectListSchema schema;

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
         * <p>2985028</p>
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
         * <p>MANAGED_TABLE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("updated")
        public Boolean updated;

        public static ListMmsTablesResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTablesResponseBodyDataObjectList self = new ListMmsTablesResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListMmsTablesResponseBodyDataObjectList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListMmsTablesResponseBodyDataObjectList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListMmsTablesResponseBodyDataObjectList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListMmsTablesResponseBodyDataObjectList setHasPartitions(Boolean hasPartitions) {
            this.hasPartitions = hasPartitions;
            return this;
        }
        public Boolean getHasPartitions() {
            return this.hasPartitions;
        }

        public ListMmsTablesResponseBodyDataObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsTablesResponseBodyDataObjectList setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public ListMmsTablesResponseBodyDataObjectList setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public ListMmsTablesResponseBodyDataObjectList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListMmsTablesResponseBodyDataObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsTablesResponseBodyDataObjectList setNumRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }
        public Long getNumRows() {
            return this.numRows;
        }

        public ListMmsTablesResponseBodyDataObjectList setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public ListMmsTablesResponseBodyDataObjectList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListMmsTablesResponseBodyDataObjectList setPartitions(Integer partitions) {
            this.partitions = partitions;
            return this;
        }
        public Integer getPartitions() {
            return this.partitions;
        }

        public ListMmsTablesResponseBodyDataObjectList setPartitionsDoing(Integer partitionsDoing) {
            this.partitionsDoing = partitionsDoing;
            return this;
        }
        public Integer getPartitionsDoing() {
            return this.partitionsDoing;
        }

        public ListMmsTablesResponseBodyDataObjectList setPartitionsDone(Integer partitionsDone) {
            this.partitionsDone = partitionsDone;
            return this;
        }
        public Integer getPartitionsDone() {
            return this.partitionsDone;
        }

        public ListMmsTablesResponseBodyDataObjectList setPartitionsFailed(Integer partitionsFailed) {
            this.partitionsFailed = partitionsFailed;
            return this;
        }
        public Integer getPartitionsFailed() {
            return this.partitionsFailed;
        }

        public ListMmsTablesResponseBodyDataObjectList setSchema(ListMmsTablesResponseBodyDataObjectListSchema schema) {
            this.schema = schema;
            return this;
        }
        public ListMmsTablesResponseBodyDataObjectListSchema getSchema() {
            return this.schema;
        }

        public ListMmsTablesResponseBodyDataObjectList setSerde(String serde) {
            this.serde = serde;
            return this;
        }
        public String getSerde() {
            return this.serde;
        }

        public ListMmsTablesResponseBodyDataObjectList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListMmsTablesResponseBodyDataObjectList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListMmsTablesResponseBodyDataObjectList setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListMmsTablesResponseBodyDataObjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMmsTablesResponseBodyDataObjectList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMmsTablesResponseBodyDataObjectList setUpdated(Boolean updated) {
            this.updated = updated;
            return this;
        }
        public Boolean getUpdated() {
            return this.updated;
        }

    }

    public static class ListMmsTablesResponseBodyData extends TeaModel {
        @NameInMap("objectList")
        public java.util.List<ListMmsTablesResponseBodyDataObjectList> objectList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListMmsTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTablesResponseBodyData self = new ListMmsTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsTablesResponseBodyData setObjectList(java.util.List<ListMmsTablesResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListMmsTablesResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListMmsTablesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListMmsTablesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMmsTablesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
