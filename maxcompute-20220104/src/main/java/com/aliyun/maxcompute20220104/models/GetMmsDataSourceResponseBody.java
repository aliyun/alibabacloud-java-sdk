// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsDataSourceResponseBody extends TeaModel {
    @NameInMap("data")
    public GetMmsDataSourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>98EC8C47-3D6D-560C-808B-84E494220A32</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsDataSourceResponseBody self = new GetMmsDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsDataSourceResponseBody setData(GetMmsDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsDataSourceResponseBodyData getData() {
        return this.data;
    }

    public GetMmsDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsDataSourceResponseBodyDataConfig extends TeaModel {
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

        public static GetMmsDataSourceResponseBodyDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMmsDataSourceResponseBodyDataConfig self = new GetMmsDataSourceResponseBodyDataConfig();
            return TeaModel.build(map, self);
        }

        public GetMmsDataSourceResponseBodyDataConfig setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetMmsDataSourceResponseBodyDataConfig setEnums(java.util.List<String> enums) {
            this.enums = enums;
            return this;
        }
        public java.util.List<String> getEnums() {
            return this.enums;
        }

        public GetMmsDataSourceResponseBodyDataConfig setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetMmsDataSourceResponseBodyDataConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMmsDataSourceResponseBodyDataConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsDataSourceResponseBodyDataConfig setPlaceHolder(String placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public GetMmsDataSourceResponseBodyDataConfig setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetMmsDataSourceResponseBodyDataConfig setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetMmsDataSourceResponseBodyDataConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMmsDataSourceResponseBodyDataConfig setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class GetMmsDataSourceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("agentIsOnline")
        public Boolean agentIsOnline;

        @NameInMap("config")
        public java.util.List<GetMmsDataSourceResponseBodyDataConfig> config;

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
         * <p>vpc-2zebqp6uojhdla46677tl:cn-shanghai</p>
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
         * <p>23322</p>
         */
        @NameInMap("partitionsDoingNum")
        public Integer partitionsDoingNum;

        /**
         * <strong>example:</strong>
         * <p>11113</p>
         */
        @NameInMap("partitionsDoneNum")
        public Integer partitionsDoneNum;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("partitionsFailedNum")
        public Integer partitionsFailedNum;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <p>19</p>
         */
        @NameInMap("tablesDoingNum")
        public Integer tablesDoingNum;

        /**
         * <strong>example:</strong>
         * <p>16</p>
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
         * <p>123</p>
         */
        @NameInMap("tablesPartDoneNum")
        public Integer tablesPartDoneNum;

        /**
         * <strong>example:</strong>
         * <p>BIGQUERY</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMmsDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsDataSourceResponseBodyData self = new GetMmsDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsDataSourceResponseBodyData setAgentIsOnline(Boolean agentIsOnline) {
            this.agentIsOnline = agentIsOnline;
            return this;
        }
        public Boolean getAgentIsOnline() {
            return this.agentIsOnline;
        }

        public GetMmsDataSourceResponseBodyData setConfig(java.util.List<GetMmsDataSourceResponseBodyDataConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<GetMmsDataSourceResponseBodyDataConfig> getConfig() {
            return this.config;
        }

        public GetMmsDataSourceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMmsDataSourceResponseBodyData setDbNum(Integer dbNum) {
            this.dbNum = dbNum;
            return this;
        }
        public Integer getDbNum() {
            return this.dbNum;
        }

        public GetMmsDataSourceResponseBodyData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetMmsDataSourceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsDataSourceResponseBodyData setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetMmsDataSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMmsDataSourceResponseBodyData setNetworklink(String networklink) {
            this.networklink = networklink;
            return this;
        }
        public String getNetworklink() {
            return this.networklink;
        }

        public GetMmsDataSourceResponseBodyData setPartitionNum(Integer partitionNum) {
            this.partitionNum = partitionNum;
            return this;
        }
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        public GetMmsDataSourceResponseBodyData setPartitionsDoingNum(Integer partitionsDoingNum) {
            this.partitionsDoingNum = partitionsDoingNum;
            return this;
        }
        public Integer getPartitionsDoingNum() {
            return this.partitionsDoingNum;
        }

        public GetMmsDataSourceResponseBodyData setPartitionsDoneNum(Integer partitionsDoneNum) {
            this.partitionsDoneNum = partitionsDoneNum;
            return this;
        }
        public Integer getPartitionsDoneNum() {
            return this.partitionsDoneNum;
        }

        public GetMmsDataSourceResponseBodyData setPartitionsFailedNum(Integer partitionsFailedNum) {
            this.partitionsFailedNum = partitionsFailedNum;
            return this;
        }
        public Integer getPartitionsFailedNum() {
            return this.partitionsFailedNum;
        }

        public GetMmsDataSourceResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMmsDataSourceResponseBodyData setScanId(Long scanId) {
            this.scanId = scanId;
            return this;
        }
        public Long getScanId() {
            return this.scanId;
        }

        public GetMmsDataSourceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMmsDataSourceResponseBodyData setTableNum(Integer tableNum) {
            this.tableNum = tableNum;
            return this;
        }
        public Integer getTableNum() {
            return this.tableNum;
        }

        public GetMmsDataSourceResponseBodyData setTablesDoingNum(Integer tablesDoingNum) {
            this.tablesDoingNum = tablesDoingNum;
            return this;
        }
        public Integer getTablesDoingNum() {
            return this.tablesDoingNum;
        }

        public GetMmsDataSourceResponseBodyData setTablesDoneNum(Integer tablesDoneNum) {
            this.tablesDoneNum = tablesDoneNum;
            return this;
        }
        public Integer getTablesDoneNum() {
            return this.tablesDoneNum;
        }

        public GetMmsDataSourceResponseBodyData setTablesFailedNum(Integer tablesFailedNum) {
            this.tablesFailedNum = tablesFailedNum;
            return this;
        }
        public Integer getTablesFailedNum() {
            return this.tablesFailedNum;
        }

        public GetMmsDataSourceResponseBodyData setTablesPartDoneNum(Integer tablesPartDoneNum) {
            this.tablesPartDoneNum = tablesPartDoneNum;
            return this;
        }
        public Integer getTablesPartDoneNum() {
            return this.tablesPartDoneNum;
        }

        public GetMmsDataSourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
