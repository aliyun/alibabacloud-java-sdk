// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQueryOptimizeDataStatsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("AvgLockTime")
        public Double avgLockTime;

        @NameInMap("AvgQueryTime")
        public Double avgQueryTime;

        @NameInMap("AvgRowsAffected")
        public Double avgRowsAffected;

        @NameInMap("AvgRowsExamined")
        public Double avgRowsExamined;

        @NameInMap("AvgRowsSent")
        public Double avgRowsSent;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("Dbname")
        public String dbname;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxLockTime")
        public Double maxLockTime;

        @NameInMap("MaxQueryTime")
        public Double maxQueryTime;

        @NameInMap("MaxRowsAffected")
        public Long maxRowsAffected;

        @NameInMap("MaxRowsExamined")
        public Long maxRowsExamined;

        @NameInMap("MaxRowsSent")
        public Long maxRowsSent;

        @NameInMap("Psql")
        public String psql;

        @NameInMap("RuleList")
        public java.util.List<GetQueryOptimizeDataStatsResponseBodyDataListRuleList> ruleList;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlSample")
        public String sqlSample;

        @NameInMap("SqlType")
        public String sqlType;

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
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public java.util.List<GetQueryOptimizeDataStatsResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

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
