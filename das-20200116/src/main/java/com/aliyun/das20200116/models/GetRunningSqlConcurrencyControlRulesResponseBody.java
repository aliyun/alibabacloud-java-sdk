// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRunningSqlConcurrencyControlRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRunningSqlConcurrencyControlRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetRunningSqlConcurrencyControlRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunningSqlConcurrencyControlRulesResponseBody self = new GetRunningSqlConcurrencyControlRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunningSqlConcurrencyControlRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRunningSqlConcurrencyControlRulesResponseBody setData(GetRunningSqlConcurrencyControlRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRunningSqlConcurrencyControlRulesResponseBodyData getData() {
        return this.data;
    }

    public GetRunningSqlConcurrencyControlRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRunningSqlConcurrencyControlRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunningSqlConcurrencyControlRulesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules extends TeaModel {
        @NameInMap("ConcurrencyControlTime")
        public Long concurrencyControlTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("KeywordsHash")
        public String keywordsHash;

        @NameInMap("MaxConcurrency")
        public String maxConcurrency;

        @NameInMap("SqlKeywords")
        public String sqlKeywords;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        public static GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules build(java.util.Map<String, ?> map) throws Exception {
            GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules self = new GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules();
            return TeaModel.build(map, self);
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setConcurrencyControlTime(Long concurrencyControlTime) {
            this.concurrencyControlTime = concurrencyControlTime;
            return this;
        }
        public Long getConcurrencyControlTime() {
            return this.concurrencyControlTime;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setKeywordsHash(String keywordsHash) {
            this.keywordsHash = keywordsHash;
            return this;
        }
        public String getKeywordsHash() {
            return this.keywordsHash;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setMaxConcurrency(String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setSqlKeywords(String sqlKeywords) {
            this.sqlKeywords = sqlKeywords;
            return this;
        }
        public String getSqlKeywords() {
            return this.sqlKeywords;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetRunningSqlConcurrencyControlRulesResponseBodyDataList extends TeaModel {
        @NameInMap("runningRules")
        public java.util.List<GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules> runningRules;

        public static GetRunningSqlConcurrencyControlRulesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetRunningSqlConcurrencyControlRulesResponseBodyDataList self = new GetRunningSqlConcurrencyControlRulesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyDataList setRunningRules(java.util.List<GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules> runningRules) {
            this.runningRules = runningRules;
            return this;
        }
        public java.util.List<GetRunningSqlConcurrencyControlRulesResponseBodyDataListRunningRules> getRunningRules() {
            return this.runningRules;
        }

    }

    public static class GetRunningSqlConcurrencyControlRulesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public GetRunningSqlConcurrencyControlRulesResponseBodyDataList list;

        @NameInMap("Total")
        public Long total;

        public static GetRunningSqlConcurrencyControlRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRunningSqlConcurrencyControlRulesResponseBodyData self = new GetRunningSqlConcurrencyControlRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyData setList(GetRunningSqlConcurrencyControlRulesResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public GetRunningSqlConcurrencyControlRulesResponseBodyDataList getList() {
            return this.list;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
