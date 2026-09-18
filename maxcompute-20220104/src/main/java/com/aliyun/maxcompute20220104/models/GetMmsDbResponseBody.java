// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsDbResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetMmsDbResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90D64EB6-2962-5B1C-A039-BC41C8176C7F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsDbResponseBody self = new GetMmsDbResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsDbResponseBody setData(GetMmsDbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsDbResponseBodyData getData() {
        return this.data;
    }

    public GetMmsDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsDbResponseBodyData extends TeaModel {
        /**
         * <p>The database description.</p>
         * 
         * <strong>example:</strong>
         * <p>for mms_test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MaxCompute schema corresponding to the source database. If the destination MaxCompute project does not enable the schema layer, this value is null. By default, this value matches the source database name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("dstName")
        public String dstName;

        /**
         * <p>The name of the destination MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>mma_test</p>
         */
        @NameInMap("dstProjectName")
        public String dstProjectName;

        /**
         * <p>Other information stored in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The last DDL time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:42</p>
         */
        @NameInMap("lastDdlTime")
        public String lastDdlTime;

        /**
         * <p>The storage location of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://master-1-1.c-6fc187819ed6bae0.cn-shanghai.emr.aliyuncs.com:9000/user/hive/warehouse</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of rows in the database.</p>
         * 
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("numRows")
        public Long numRows;

        /**
         * <p>The database owner.</p>
         * 
         * <strong>example:</strong>
         * <p>System user</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("partitions")
        public Integer partitions;

        /**
         * <p>The partitions that are being migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("partitionsDoing")
        public Integer partitionsDoing;

        /**
         * <p>The number of partitions whose migration is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>1400</p>
         */
        @NameInMap("partitionsDone")
        public Integer partitionsDone;

        /**
         * <p>The partitions that failed during migration.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("partitionsFailed")
        public Integer partitionsFailed;

        /**
         * <p>The size of the database in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>323232332</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>2000017</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("sourceName")
        public String sourceName;

        /**
         * <p>The migration status. Valid values: INIT, DOING, FAILED, DONE, and PART_DONE.</p>
         * 
         * <strong>example:</strong>
         * <p>DOING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The number of tables.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("tables")
        public Integer tables;

        /**
         * <p>The tables that are being migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("tablesDoing")
        public Integer tablesDoing;

        /**
         * <p>Tables for which migration has completed</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("tablesDone")
        public Integer tablesDone;

        /**
         * <p>The tables that failed to migrate.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("tablesFailed")
        public Integer tablesFailed;

        /**
         * <p>The tables whose migration is partially complete.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("tablesPartDone")
        public Integer tablesPartDone;

        /**
         * <p>Indicates whether the metadata is updated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("updated")
        public Boolean updated;

        public static GetMmsDbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsDbResponseBodyData self = new GetMmsDbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsDbResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMmsDbResponseBodyData setDstName(String dstName) {
            this.dstName = dstName;
            return this;
        }
        public String getDstName() {
            return this.dstName;
        }

        public GetMmsDbResponseBodyData setDstProjectName(String dstProjectName) {
            this.dstProjectName = dstProjectName;
            return this;
        }
        public String getDstProjectName() {
            return this.dstProjectName;
        }

        public GetMmsDbResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetMmsDbResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsDbResponseBodyData setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMmsDbResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMmsDbResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsDbResponseBodyData setNumRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }
        public Long getNumRows() {
            return this.numRows;
        }

        public GetMmsDbResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetMmsDbResponseBodyData setPartitions(Integer partitions) {
            this.partitions = partitions;
            return this;
        }
        public Integer getPartitions() {
            return this.partitions;
        }

        public GetMmsDbResponseBodyData setPartitionsDoing(Integer partitionsDoing) {
            this.partitionsDoing = partitionsDoing;
            return this;
        }
        public Integer getPartitionsDoing() {
            return this.partitionsDoing;
        }

        public GetMmsDbResponseBodyData setPartitionsDone(Integer partitionsDone) {
            this.partitionsDone = partitionsDone;
            return this;
        }
        public Integer getPartitionsDone() {
            return this.partitionsDone;
        }

        public GetMmsDbResponseBodyData setPartitionsFailed(Integer partitionsFailed) {
            this.partitionsFailed = partitionsFailed;
            return this;
        }
        public Integer getPartitionsFailed() {
            return this.partitionsFailed;
        }

        public GetMmsDbResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetMmsDbResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetMmsDbResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public GetMmsDbResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMmsDbResponseBodyData setTables(Integer tables) {
            this.tables = tables;
            return this;
        }
        public Integer getTables() {
            return this.tables;
        }

        public GetMmsDbResponseBodyData setTablesDoing(Integer tablesDoing) {
            this.tablesDoing = tablesDoing;
            return this;
        }
        public Integer getTablesDoing() {
            return this.tablesDoing;
        }

        public GetMmsDbResponseBodyData setTablesDone(Integer tablesDone) {
            this.tablesDone = tablesDone;
            return this;
        }
        public Integer getTablesDone() {
            return this.tablesDone;
        }

        public GetMmsDbResponseBodyData setTablesFailed(Integer tablesFailed) {
            this.tablesFailed = tablesFailed;
            return this;
        }
        public Integer getTablesFailed() {
            return this.tablesFailed;
        }

        public GetMmsDbResponseBodyData setTablesPartDone(Integer tablesPartDone) {
            this.tablesPartDone = tablesPartDone;
            return this;
        }
        public Integer getTablesPartDone() {
            return this.tablesPartDone;
        }

        public GetMmsDbResponseBodyData setUpdated(Boolean updated) {
            this.updated = updated;
            return this;
        }
        public Boolean getUpdated() {
            return this.updated;
        }

    }

}
