// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelRuleInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySentinelRuleInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySentinelRuleInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelRuleInfoResponseBody self = new QuerySentinelRuleInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySentinelRuleInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySentinelRuleInfoResponseBody setData(QuerySentinelRuleInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySentinelRuleInfoResponseBodyData getData() {
        return this.data;
    }

    public QuerySentinelRuleInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySentinelRuleInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySentinelRuleInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySentinelRuleInfoResponseBodyData extends TeaModel {
        @NameInMap("AllRules")
        public java.util.Map<String, ?> allRules;

        @NameInMap("AllRulesCount")
        public Long allRulesCount;

        @NameInMap("EffectRules")
        public java.util.Map<String, ?> effectRules;

        @NameInMap("EffectRulesCount")
        public Long effectRulesCount;

        public static QuerySentinelRuleInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySentinelRuleInfoResponseBodyData self = new QuerySentinelRuleInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySentinelRuleInfoResponseBodyData setAllRules(java.util.Map<String, ?> allRules) {
            this.allRules = allRules;
            return this;
        }
        public java.util.Map<String, ?> getAllRules() {
            return this.allRules;
        }

        public QuerySentinelRuleInfoResponseBodyData setAllRulesCount(Long allRulesCount) {
            this.allRulesCount = allRulesCount;
            return this;
        }
        public Long getAllRulesCount() {
            return this.allRulesCount;
        }

        public QuerySentinelRuleInfoResponseBodyData setEffectRules(java.util.Map<String, ?> effectRules) {
            this.effectRules = effectRules;
            return this;
        }
        public java.util.Map<String, ?> getEffectRules() {
            return this.effectRules;
        }

        public QuerySentinelRuleInfoResponseBodyData setEffectRulesCount(Long effectRulesCount) {
            this.effectRulesCount = effectRulesCount;
            return this;
        }
        public Long getEffectRulesCount() {
            return this.effectRulesCount;
        }

    }

}
