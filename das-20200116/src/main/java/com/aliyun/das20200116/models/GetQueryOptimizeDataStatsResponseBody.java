// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataStatsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetQueryOptimizeDataStatsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeDataStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataStatsResponseBody self = new GetQueryOptimizeDataStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeDataStatsResponseBody setData(GetQueryOptimizeDataStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeDataStatsResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeDataStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeDataStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeDataStatsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeDataStatsResponseBodyDataListRuleList extends TeaModel {
        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>DAS_NOT_IMPORTANT</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>Predefined</strong></li>
         * <li><strong>UserDefined</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Predefined</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetQueryOptimizeDataStatsResponseBodyDataListRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeDataStatsResponseBodyDataListRuleList self = new GetQueryOptimizeDataStatsResponseBodyDataListRuleList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeDataStatsResponseBodyDataListRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataListRuleList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQueryOptimizeDataStatsResponseBodyDataList extends TeaModel {
        /**
         * <p>The average lock wait time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("AvgLockTime")
        public Double avgLockTime;

        /**
         * <p>The average query execution time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1</p>
         */
        @NameInMap("AvgQueryTime")
        public Double avgQueryTime;

        /**
         * <p>The average number of rows affected by the SQL statement.</p>
         * <blockquote>
         * <p>A value of -1 indicates that this parameter is not collected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100.1</p>
         */
        @NameInMap("AvgRowsAffected")
        public Double avgRowsAffected;

        /**
         * <p>The average number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>100.1</p>
         */
        @NameInMap("AvgRowsExamined")
        public Double avgRowsExamined;

        /**
         * <p>The average number of returned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>100.1</p>
         */
        @NameInMap("AvgRowsSent")
        public Double avgRowsSent;

        /**
         * <p>The number of times that the SQL template is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the database to which the SQL template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb01</p>
         */
        @NameInMap("Dbname")
        public String dbname;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The longest lock wait time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("MaxLockTime")
        public Double maxLockTime;

        /**
         * <p>The longest query execution time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1</p>
         */
        @NameInMap("MaxQueryTime")
        public Double maxQueryTime;

        /**
         * <p>The largest number of rows affected by the SQL template.</p>
         * <blockquote>
         * <p>A value of -1 indicates that this parameter is not collected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxRowsAffected")
        public Long maxRowsAffected;

        /**
         * <p>The largest number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("MaxRowsExamined")
        public Long maxRowsExamined;

        /**
         * <p>The largest number of returned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxRowsSent")
        public Long maxRowsSent;

        /**
         * <p>The SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1</p>
         */
        @NameInMap("Psql")
        public String psql;

        /**
         * <p>The information about the rules.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<GetQueryOptimizeDataStatsResponseBodyDataListRuleList> ruleList;

        /**
         * <p>The SQL template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The sample query that took the longest time to execute.</p>
         * 
         * <strong>example:</strong>
         * <p>select 2</p>
         */
        @NameInMap("SqlSample")
        public String sqlSample;

        /**
         * <p>The type of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>INSERT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The account of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        @NameInMap("User")
        public String user;

        public static GetQueryOptimizeDataStatsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeDataStatsResponseBodyDataList self = new GetQueryOptimizeDataStatsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setAvgLockTime(Double avgLockTime) {
            this.avgLockTime = avgLockTime;
            return this;
        }
        public Double getAvgLockTime() {
            return this.avgLockTime;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setAvgQueryTime(Double avgQueryTime) {
            this.avgQueryTime = avgQueryTime;
            return this;
        }
        public Double getAvgQueryTime() {
            return this.avgQueryTime;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setAvgRowsAffected(Double avgRowsAffected) {
            this.avgRowsAffected = avgRowsAffected;
            return this;
        }
        public Double getAvgRowsAffected() {
            return this.avgRowsAffected;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setAvgRowsExamined(Double avgRowsExamined) {
            this.avgRowsExamined = avgRowsExamined;
            return this;
        }
        public Double getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setAvgRowsSent(Double avgRowsSent) {
            this.avgRowsSent = avgRowsSent;
            return this;
        }
        public Double getAvgRowsSent() {
            return this.avgRowsSent;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setDbname(String dbname) {
            this.dbname = dbname;
            return this;
        }
        public String getDbname() {
            return this.dbname;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setMaxLockTime(Double maxLockTime) {
            this.maxLockTime = maxLockTime;
            return this;
        }
        public Double getMaxLockTime() {
            return this.maxLockTime;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setMaxQueryTime(Double maxQueryTime) {
            this.maxQueryTime = maxQueryTime;
            return this;
        }
        public Double getMaxQueryTime() {
            return this.maxQueryTime;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setMaxRowsAffected(Long maxRowsAffected) {
            this.maxRowsAffected = maxRowsAffected;
            return this;
        }
        public Long getMaxRowsAffected() {
            return this.maxRowsAffected;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setMaxRowsExamined(Long maxRowsExamined) {
            this.maxRowsExamined = maxRowsExamined;
            return this;
        }
        public Long getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setMaxRowsSent(Long maxRowsSent) {
            this.maxRowsSent = maxRowsSent;
            return this;
        }
        public Long getMaxRowsSent() {
            return this.maxRowsSent;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setPsql(String psql) {
            this.psql = psql;
            return this;
        }
        public String getPsql() {
            return this.psql;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setRuleList(java.util.List<GetQueryOptimizeDataStatsResponseBodyDataListRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<GetQueryOptimizeDataStatsResponseBodyDataListRuleList> getRuleList() {
            return this.ruleList;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setSqlSample(String sqlSample) {
            this.sqlSample = sqlSample;
            return this;
        }
        public String getSqlSample() {
            return this.sqlSample;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetQueryOptimizeDataStatsResponseBodyDataList setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class GetQueryOptimizeDataStatsResponseBodyData extends TeaModel {
        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The information about the SQL templates.</p>
         */
        @NameInMap("List")
        public java.util.List<GetQueryOptimizeDataStatsResponseBodyDataList> list;

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetQueryOptimizeDataStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeDataStatsResponseBodyData self = new GetQueryOptimizeDataStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeDataStatsResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetQueryOptimizeDataStatsResponseBodyData setList(java.util.List<GetQueryOptimizeDataStatsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetQueryOptimizeDataStatsResponseBodyDataList> getList() {
            return this.list;
        }

        public GetQueryOptimizeDataStatsResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQueryOptimizeDataStatsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueryOptimizeDataStatsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
