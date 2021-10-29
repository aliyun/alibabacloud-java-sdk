// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlRulesHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSqlConcurrencyControlRulesHistoryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSqlConcurrencyControlRulesHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConcurrencyControlRulesHistoryResponseBody self = new GetSqlConcurrencyControlRulesHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlConcurrencyControlRulesHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSqlConcurrencyControlRulesHistoryResponseBody setData(GetSqlConcurrencyControlRulesHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSqlConcurrencyControlRulesHistoryResponseBodyData getData() {
        return this.data;
    }

    public GetSqlConcurrencyControlRulesHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSqlConcurrencyControlRulesHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlConcurrencyControlRulesHistoryResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules extends TeaModel {
        @NameInMap("ConcurrencyControlTime")
        public Long concurrencyControlTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("KeywordsHash")
        public String keywordsHash;

        @NameInMap("MaxConcurrency")
        public Long maxConcurrency;

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

        public static GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules build(java.util.Map<String, ?> map) throws Exception {
            GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules self = new GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules();
            return TeaModel.build(map, self);
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setConcurrencyControlTime(Long concurrencyControlTime) {
            this.concurrencyControlTime = concurrencyControlTime;
            return this;
        }
        public Long getConcurrencyControlTime() {
            return this.concurrencyControlTime;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setKeywordsHash(String keywordsHash) {
            this.keywordsHash = keywordsHash;
            return this;
        }
        public String getKeywordsHash() {
            return this.keywordsHash;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setMaxConcurrency(Long maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Long getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setSqlKeywords(String sqlKeywords) {
            this.sqlKeywords = sqlKeywords;
            return this;
        }
        public String getSqlKeywords() {
            return this.sqlKeywords;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetSqlConcurrencyControlRulesHistoryResponseBodyDataList extends TeaModel {
        @NameInMap("rules")
        public java.util.List<GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules> rules;

        public static GetSqlConcurrencyControlRulesHistoryResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetSqlConcurrencyControlRulesHistoryResponseBodyDataList self = new GetSqlConcurrencyControlRulesHistoryResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataList setRules(java.util.List<GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetSqlConcurrencyControlRulesHistoryResponseBodyDataListRules> getRules() {
            return this.rules;
        }

    }

    public static class GetSqlConcurrencyControlRulesHistoryResponseBodyData extends TeaModel {
        @NameInMap("List")
        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataList list;

        @NameInMap("Total")
        public Long total;

        public static GetSqlConcurrencyControlRulesHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSqlConcurrencyControlRulesHistoryResponseBodyData self = new GetSqlConcurrencyControlRulesHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyData setList(GetSqlConcurrencyControlRulesHistoryResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataList getList() {
            return this.list;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
