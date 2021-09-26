// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetQualityRuleDetailResponseBodyData data;

    public static GetQualityRuleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleDetailResponseBody self = new GetQualityRuleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityRuleDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityRuleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityRuleDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetQualityRuleDetailResponseBody setData(GetQualityRuleDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityRuleDetailResponseBodyData getData() {
        return this.data;
    }

    public static class GetQualityRuleDetailResponseBodyData extends TeaModel {
        @NameInMap("RuleTag")
        public Integer ruleTag;

        @NameInMap("MatchType")
        public Integer matchType;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleCreateTime")
        public String ruleCreateTime;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        public static GetQualityRuleDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleDetailResponseBodyData self = new GetQualityRuleDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleDetailResponseBodyData setRuleTag(Integer ruleTag) {
            this.ruleTag = ruleTag;
            return this;
        }
        public Integer getRuleTag() {
            return this.ruleTag;
        }

        public GetQualityRuleDetailResponseBodyData setMatchType(Integer matchType) {
            this.matchType = matchType;
            return this;
        }
        public Integer getMatchType() {
            return this.matchType;
        }

        public GetQualityRuleDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityRuleDetailResponseBodyData setRuleCreateTime(String ruleCreateTime) {
            this.ruleCreateTime = ruleCreateTime;
            return this;
        }
        public String getRuleCreateTime() {
            return this.ruleCreateTime;
        }

        public GetQualityRuleDetailResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetQualityRuleDetailResponseBodyData setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

    }

}
