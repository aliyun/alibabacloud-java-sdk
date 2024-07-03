// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRunningSqlConcurrencyControlRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
     */
    @NameInMap("Data")
    public GetRunningSqlConcurrencyControlRulesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The duration within which the SQL throttling rule takes effect. Unit: seconds.</p>
         * <blockquote>
         * <p>The throttling rule takes effect only within this duration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("ConcurrencyControlTime")
        public Long concurrencyControlTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the throttling rule that is applied to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>The hash value of the SQL keywords. The hash value is calculated based on the SQL keywords that are contained in the SQL statements to which the throttling rule is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>b0b8aceeb43baea87b219c81767b****</p>
         */
        @NameInMap("KeywordsHash")
        public String keywordsHash;

        /**
         * <p>The maximum number of concurrent SQL statements. The value is a positive integer.</p>
         * <blockquote>
         * <p>If the number of concurrent SQL statements that contain the specified keywords reaches this upper limit, the throttling rule is triggered.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxConcurrency")
        public String maxConcurrency;

        /**
         * <p>The keywords contained in the SQL statements to which the throttling rule was applied.</p>
         * <blockquote>
         * <p>SQL keywords are separated by tildes (~). If the number of concurrent SQL statements that contain all the specified SQL keywords reaches the specified upper limit, the throttling rule is triggered.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>call<del>open</del>api<del>test</del>4<del>from</del>POP</p>
         */
        @NameInMap("SqlKeywords")
        public String sqlKeywords;

        /**
         * <p>The type of the SQL statements. Valid values:</p>
         * <ul>
         * <li><strong>SELECT</strong></li>
         * <li><strong>UPDATE</strong></li>
         * <li><strong>DELETE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The time when the throttling rule started to take effect. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the throttling rule. The value of <strong>Open</strong> indicates that the throttling rule is in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testxxx</p>
         */
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
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("List")
        public GetRunningSqlConcurrencyControlRulesResponseBodyDataList list;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
