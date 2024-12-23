// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDataSourcesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListMmsDataSourcesResponseBodyData data;

    /**
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
        @NameInMap("desc")
        public String desc;

        @NameInMap("enums")
        public java.util.List<String> enums;

        /**
         * <strong>example:</strong>
         * <p>basic_group</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <strong>example:</strong>
         * <p>bigquery.range.partition.migrate.type</p>
         */
        @NameInMap("key")
        public String key;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Cluster or Partition</p>
         */
        @NameInMap("placeHolder")
        public String placeHolder;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>.keytab</p>
         */
        @NameInMap("subType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("agentIsOnline")
        public Boolean agentIsOnline;

        @NameInMap("config")
        public java.util.List<ListMmsDataSourcesResponseBodyDataObjectListConfig> config;

        /**
         * <strong>example:</strong>
         * <p>2024-12-17 09:29:58</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("dbNum")
        public Integer dbNum;

        /**
         * <strong>example:</strong>
         * <p>unexpected exception</p>
         */
        @NameInMap("errMsg")
        public String errMsg;

        /**
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:17</p>
         */
        @NameInMap("lastUpdateTime")
        public String lastUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zebqp6uojhdla46677tl:cn-beijing</p>
         */
        @NameInMap("networklink")
        public String networklink;

        /**
         * <strong>example:</strong>
         * <p>10000000</p>
         */
        @NameInMap("partitionNum")
        public Integer partitionNum;

        /**
         * <strong>example:</strong>
         * <p>2332</p>
         */
        @NameInMap("partitionsDoingNum")
        public Integer partitionsDoingNum;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("partitionsDoneNum")
        public Integer partitionsDoneNum;

        /**
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("partitionsFailedNum")
        public Integer partitionsFailedNum;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1000253</p>
         */
        @NameInMap("scanId")
        public Long scanId;

        /**
         * <strong>example:</strong>
         * <p>STARTED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("tableNum")
        public Integer tableNum;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("tablesDoingNum")
        public Integer tablesDoingNum;

        /**
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("tablesDoneNum")
        public Integer tablesDoneNum;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("tablesFailedNum")
        public Integer tablesFailedNum;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("tablesPartDoneNum")
        public Integer tablesPartDoneNum;

        /**
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
        @NameInMap("objectList")
        public java.util.List<ListMmsDataSourcesResponseBodyDataObjectList> objectList;

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
