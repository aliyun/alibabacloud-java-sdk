// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlRulesHistoryResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
     */
    @NameInMap("Data")
    public GetSqlConcurrencyControlRulesHistoryResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The duration within which the SQL throttling rule takes effect. Unit: seconds.</p>
         * <br>
         * <p>>  The throttling rule takes effect only within this duration.</p>
         */
        @NameInMap("ConcurrencyControlTime")
        public Long concurrencyControlTime;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the throttling rule that is applied to the instance.</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>The hash value of the SQL keywords. The SQL keywords are contained in the SQL statements to which the throttling rule is applied.</p>
         */
        @NameInMap("KeywordsHash")
        public String keywordsHash;

        /**
         * <p>The maximum number of concurrent SQL statements. Set this parameter to a positive integer.</p>
         * <br>
         * <p>>  When the number of concurrent SQL statements that contain the specified keywords reaches this upper limit, the throttling rule is triggered.</p>
         */
        @NameInMap("MaxConcurrency")
        public Long maxConcurrency;

        /**
         * <p>The keywords that are used to identify the SQL statements that need to be throttled.</p>
         * <br>
         * <p>> SQL keywords are separated with tildes (~). When the number of concurrent SQL statements that contain all the specified SQL keywords reaches the specified upper limit, the throttling rule is triggered.</p>
         */
        @NameInMap("SqlKeywords")
        public String sqlKeywords;

        /**
         * <p>The type of the SQL statements. Valid values:</p>
         * <br>
         * <p>* **SELECT**</p>
         * <p>* **UPDATE**</p>
         * <p>* **DELETE**</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The state of the throttling rule. Valid values:</p>
         * <br>
         * <p>* **Open**: The throttling rule is in effect.</p>
         * <p>* **Closed**: The throttling rule was in effect.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user ID.</p>
         */
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
        /**
         * <p>The list of the queried throttling rules.</p>
         */
        @NameInMap("List")
        public GetSqlConcurrencyControlRulesHistoryResponseBodyDataList list;

        /**
         * <p>The total number of entries returned.</p>
         */
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
