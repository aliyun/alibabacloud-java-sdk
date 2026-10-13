// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDbsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListMmsDbsResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF3F9978-260F-5204-94BE-30A4E6B54443</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsDbsResponseBody self = new ListMmsDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsDbsResponseBody setData(ListMmsDbsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMmsDbsResponseBodyData getData() {
        return this.data;
    }

    public ListMmsDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsDbsResponseBodyDataObjectList extends TeaModel {
        /**
         * <p>The time when the database was created in MMS.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:42</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Indicates whether the database has been deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deleted")
        public Boolean deleted;

        /**
         * <p>The description of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>for mms test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MaxCompute schema that corresponds to the source database. If the schema layer is not enabled for the destination MaxCompute project, this value is null. By default, this value is the same as the name of the source database.</p>
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
         * <p>mms_test</p>
         */
        @NameInMap("dstProjectName")
        public String dstProjectName;

        /**
         * <p>The additional information stored in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>1530</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Last DDL Time</p>
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
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of data rows in the database.</p>
         * 
         * <strong>example:</strong>
         * <p>23232</p>
         */
        @NameInMap("numRows")
        public Long numRows;

        /**
         * <p>The owner of the database.</p>
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
         * <p>1000</p>
         */
        @NameInMap("partitions")
        public Integer partitions;

        /**
         * <p>The partitions being migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("partitionsDoing")
        public Integer partitionsDoing;

        /**
         * <p>The partitions that have been migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("partitionsDone")
        public Integer partitionsDone;

        /**
         * <p>The partitions that failed to migrate.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("partitionsFailed")
        public Integer partitionsFailed;

        /**
         * <p>The size of the database data, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2342342</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
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
         * <p>100</p>
         */
        @NameInMap("tables")
        public Integer tables;

        /**
         * <p>The tables being migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("tablesDoing")
        public Integer tablesDoing;

        /**
         * <p>The tables that have been migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The tables that are partially migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("tablesPartDone")
        public Integer tablesPartDone;

        /**
         * <p>The latest update time of the data. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:42</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>Indicates whether the data has been updated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("updated")
        public Boolean updated;

        public static ListMmsDbsResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListMmsDbsResponseBodyDataObjectList self = new ListMmsDbsResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListMmsDbsResponseBodyDataObjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMmsDbsResponseBodyDataObjectList setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListMmsDbsResponseBodyDataObjectList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMmsDbsResponseBodyDataObjectList setDstName(String dstName) {
            this.dstName = dstName;
            return this;
        }
        public String getDstName() {
            return this.dstName;
        }

        public ListMmsDbsResponseBodyDataObjectList setDstProjectName(String dstProjectName) {
            this.dstProjectName = dstProjectName;
            return this;
        }
        public String getDstProjectName() {
            return this.dstProjectName;
        }

        public ListMmsDbsResponseBodyDataObjectList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListMmsDbsResponseBodyDataObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsDbsResponseBodyDataObjectList setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public ListMmsDbsResponseBodyDataObjectList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListMmsDbsResponseBodyDataObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsDbsResponseBodyDataObjectList setNumRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }
        public Long getNumRows() {
            return this.numRows;
        }

        public ListMmsDbsResponseBodyDataObjectList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListMmsDbsResponseBodyDataObjectList setPartitions(Integer partitions) {
            this.partitions = partitions;
            return this;
        }
        public Integer getPartitions() {
            return this.partitions;
        }

        public ListMmsDbsResponseBodyDataObjectList setPartitionsDoing(Integer partitionsDoing) {
            this.partitionsDoing = partitionsDoing;
            return this;
        }
        public Integer getPartitionsDoing() {
            return this.partitionsDoing;
        }

        public ListMmsDbsResponseBodyDataObjectList setPartitionsDone(Integer partitionsDone) {
            this.partitionsDone = partitionsDone;
            return this;
        }
        public Integer getPartitionsDone() {
            return this.partitionsDone;
        }

        public ListMmsDbsResponseBodyDataObjectList setPartitionsFailed(Integer partitionsFailed) {
            this.partitionsFailed = partitionsFailed;
            return this;
        }
        public Integer getPartitionsFailed() {
            return this.partitionsFailed;
        }

        public ListMmsDbsResponseBodyDataObjectList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListMmsDbsResponseBodyDataObjectList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListMmsDbsResponseBodyDataObjectList setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListMmsDbsResponseBodyDataObjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMmsDbsResponseBodyDataObjectList setTables(Integer tables) {
            this.tables = tables;
            return this;
        }
        public Integer getTables() {
            return this.tables;
        }

        public ListMmsDbsResponseBodyDataObjectList setTablesDoing(Integer tablesDoing) {
            this.tablesDoing = tablesDoing;
            return this;
        }
        public Integer getTablesDoing() {
            return this.tablesDoing;
        }

        public ListMmsDbsResponseBodyDataObjectList setTablesDone(Integer tablesDone) {
            this.tablesDone = tablesDone;
            return this;
        }
        public Integer getTablesDone() {
            return this.tablesDone;
        }

        public ListMmsDbsResponseBodyDataObjectList setTablesFailed(Integer tablesFailed) {
            this.tablesFailed = tablesFailed;
            return this;
        }
        public Integer getTablesFailed() {
            return this.tablesFailed;
        }

        public ListMmsDbsResponseBodyDataObjectList setTablesPartDone(Integer tablesPartDone) {
            this.tablesPartDone = tablesPartDone;
            return this;
        }
        public Integer getTablesPartDone() {
            return this.tablesPartDone;
        }

        public ListMmsDbsResponseBodyDataObjectList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListMmsDbsResponseBodyDataObjectList setUpdated(Boolean updated) {
            this.updated = updated;
            return this;
        }
        public Boolean getUpdated() {
            return this.updated;
        }

    }

    public static class ListMmsDbsResponseBodyData extends TeaModel {
        /**
         * <p>The list of databases.</p>
         */
        @NameInMap("objectList")
        public java.util.List<ListMmsDbsResponseBodyDataObjectList> objectList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListMmsDbsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsDbsResponseBodyData self = new ListMmsDbsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsDbsResponseBodyData setObjectList(java.util.List<ListMmsDbsResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListMmsDbsResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListMmsDbsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListMmsDbsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMmsDbsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
