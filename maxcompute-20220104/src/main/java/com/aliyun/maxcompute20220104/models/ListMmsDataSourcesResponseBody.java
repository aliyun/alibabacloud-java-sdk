// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListMmsDataSourcesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1F7715F-D316-5AB6-BD02-5241083F4003</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsDataSourcesResponseBody self = new ListMmsDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsDataSourcesResponseBody setData(ListMmsDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMmsDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListMmsDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsDataSourcesResponseBodyDataObjectListConfig extends TeaModel {
        /**
         * <p>The description of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>范围分区表迁移方式</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>The enumerated values for the configuration.</p>
         */
        @NameInMap("enums")
        public java.util.List<String> enums;

        /**
         * <p>The configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>basic_group</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The English identifier for the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>bigquery.range.partition.migrate.type</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The name of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>范围分区表迁移方式</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>An example value for the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster or Partition</p>
         */
        @NameInMap("placeHolder")
        public String placeHolder;

        /**
         * <p>Indicates whether the configuration is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("required")
        public Boolean required;

        /**
         * <p>If \<code>type\\</code> is set to \<code>file\\</code>, \<code>subType\\</code> specifies the file type, such as \<code>.keytab\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>.keytab</p>
         */
        @NameInMap("subType")
        public String subType;

        /**
         * <p>The type of the configuration. Valid values: \<code>boolean\\</code>, \<code>int\\</code>, \<code>map\\</code>, \<code>string\\</code>, \<code>password\\</code>, and \<code>file\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Partition</p>
         */
        @NameInMap("value")
        public Object value;

        public static ListMmsDataSourcesResponseBodyDataObjectListConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMmsDataSourcesResponseBodyDataObjectListConfig self = new ListMmsDataSourcesResponseBodyDataObjectListConfig();
            return TeaModel.build(map, self);
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setEnums(java.util.List<String> enums) {
            this.enums = enums;
            return this;
        }
        public java.util.List<String> getEnums() {
            return this.enums;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setPlaceHolder(String placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMmsDataSourcesResponseBodyDataObjectListConfig setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class ListMmsDataSourcesResponseBodyDataObjectList extends TeaModel {
        /**
         * <p>Indicates whether the data source instance or its associated agent is started.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("agentIsOnline")
        public Boolean agentIsOnline;

        /**
         * <p>The configurations of the data source.</p>
         */
        @NameInMap("config")
        public java.util.List<ListMmsDataSourcesResponseBodyDataObjectListConfig> config;

        /**
         * <p>The time when the data source was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 09:29:58</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The number of databases in the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("dbNum")
        public Integer dbNum;

        /**
         * <p>The default destination MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("dstProject")
        public String dstProject;

        /**
         * <p>The list of destination MaxCompute projects.</p>
         */
        @NameInMap("dstProjects")
        public java.util.List<String> dstProjects;

        /**
         * <p>The reason why the data source instance failed to start or shut down. This parameter is returned only when the value of \<code>status\\</code> is \<code>START_FAILED\\</code> or \<code>STOP_FAILED\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>unexpected exception</p>
         */
        @NameInMap("errMsg")
        public String errMsg;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The last time when the metadata was synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:17</p>
         */
        @NameInMap("lastUpdateTime")
        public String lastUpdateTime;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The MaxCompute network connectivity ID is the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zebqp6uojhdla46677tl:cn-beijing</p>
         */
        @NameInMap("networklink")
        public String networklink;

        /**
         * <p>The number of partitions in the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>10000000</p>
         */
        @NameInMap("partitionNum")
        public Integer partitionNum;

        /**
         * <p>The number of partitions that are being migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>2332</p>
         */
        @NameInMap("partitionsDoingNum")
        public Integer partitionsDoingNum;

        /**
         * <p>The number of partitions that have been migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("partitionsDoneNum")
        public Integer partitionsDoneNum;

        /**
         * <p>The number of partitions that failed to be migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("partitionsFailedNum")
        public Integer partitionsFailedNum;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The ID of the metadata synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>1000253</p>
         */
        @NameInMap("scanId")
        public Long scanId;

        /**
         * <p>The status of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>STARTED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The number of tables in the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("tableNum")
        public Integer tableNum;

        /**
         * <p>The number of tables that are being migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("tablesDoingNum")
        public Integer tablesDoingNum;

        /**
         * <p>The number of tables that have been migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("tablesDoneNum")
        public Integer tablesDoneNum;

        /**
         * <p>The number of tables that failed to be migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("tablesFailedNum")
        public Integer tablesFailedNum;

        /**
         * <p>The number of tables that are partially migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("tablesPartDoneNum")
        public Integer tablesPartDoneNum;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGQUERY</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMmsDataSourcesResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListMmsDataSourcesResponseBodyDataObjectList self = new ListMmsDataSourcesResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setAgentIsOnline(Boolean agentIsOnline) {
            this.agentIsOnline = agentIsOnline;
            return this;
        }
        public Boolean getAgentIsOnline() {
            return this.agentIsOnline;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setConfig(java.util.List<ListMmsDataSourcesResponseBodyDataObjectListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<ListMmsDataSourcesResponseBodyDataObjectListConfig> getConfig() {
            return this.config;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setDbNum(Integer dbNum) {
            this.dbNum = dbNum;
            return this;
        }
        public Integer getDbNum() {
            return this.dbNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setDstProject(String dstProject) {
            this.dstProject = dstProject;
            return this;
        }
        public String getDstProject() {
            return this.dstProject;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setDstProjects(java.util.List<String> dstProjects) {
            this.dstProjects = dstProjects;
            return this;
        }
        public java.util.List<String> getDstProjects() {
            return this.dstProjects;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setNetworklink(String networklink) {
            this.networklink = networklink;
            return this;
        }
        public String getNetworklink() {
            return this.networklink;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setPartitionNum(Integer partitionNum) {
            this.partitionNum = partitionNum;
            return this;
        }
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setPartitionsDoingNum(Integer partitionsDoingNum) {
            this.partitionsDoingNum = partitionsDoingNum;
            return this;
        }
        public Integer getPartitionsDoingNum() {
            return this.partitionsDoingNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setPartitionsDoneNum(Integer partitionsDoneNum) {
            this.partitionsDoneNum = partitionsDoneNum;
            return this;
        }
        public Integer getPartitionsDoneNum() {
            return this.partitionsDoneNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setPartitionsFailedNum(Integer partitionsFailedNum) {
            this.partitionsFailedNum = partitionsFailedNum;
            return this;
        }
        public Integer getPartitionsFailedNum() {
            return this.partitionsFailedNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setScanId(Long scanId) {
            this.scanId = scanId;
            return this;
        }
        public Long getScanId() {
            return this.scanId;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setTableNum(Integer tableNum) {
            this.tableNum = tableNum;
            return this;
        }
        public Integer getTableNum() {
            return this.tableNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setTablesDoingNum(Integer tablesDoingNum) {
            this.tablesDoingNum = tablesDoingNum;
            return this;
        }
        public Integer getTablesDoingNum() {
            return this.tablesDoingNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setTablesDoneNum(Integer tablesDoneNum) {
            this.tablesDoneNum = tablesDoneNum;
            return this;
        }
        public Integer getTablesDoneNum() {
            return this.tablesDoneNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setTablesFailedNum(Integer tablesFailedNum) {
            this.tablesFailedNum = tablesFailedNum;
            return this;
        }
        public Integer getTablesFailedNum() {
            return this.tablesFailedNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setTablesPartDoneNum(Integer tablesPartDoneNum) {
            this.tablesPartDoneNum = tablesPartDoneNum;
            return this;
        }
        public Integer getTablesPartDoneNum() {
            return this.tablesPartDoneNum;
        }

        public ListMmsDataSourcesResponseBodyDataObjectList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMmsDataSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The list of data sources.</p>
         */
        @NameInMap("objectList")
        public java.util.List<ListMmsDataSourcesResponseBodyDataObjectList> objectList;

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
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListMmsDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsDataSourcesResponseBodyData self = new ListMmsDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsDataSourcesResponseBodyData setObjectList(java.util.List<ListMmsDataSourcesResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListMmsDataSourcesResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListMmsDataSourcesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListMmsDataSourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMmsDataSourcesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
