// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneRuleDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInterveneRuleDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInterveneRuleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneRuleDetailResponseBody self = new GetInterveneRuleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInterveneRuleDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInterveneRuleDetailResponseBody setData(GetInterveneRuleDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInterveneRuleDetailResponseBodyData getData() {
        return this.data;
    }

    public GetInterveneRuleDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInterveneRuleDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInterveneRuleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInterveneRuleDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig extends TeaModel {
        @NameInMap("AnswerType")
        public Integer answerType;

        @NameInMap("Message")
        public String message;

        @NameInMap("Namespace")
        public String namespace;

        public static GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig self = new GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig();
            return TeaModel.build(map, self);
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig setAnswerType(Integer answerType) {
            this.answerType = answerType;
            return this;
        }
        public Integer getAnswerType() {
            return this.answerType;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig extends TeaModel {
        @NameInMap("EffectType")
        public Integer effectType;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig self = new GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig();
            return TeaModel.build(map, self);
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig setEffectType(Integer effectType) {
            this.effectType = effectType;
            return this;
        }
        public Integer getEffectType() {
            return this.effectType;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail extends TeaModel {
        @NameInMap("AnswerConfig")
        public java.util.List<GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig> answerConfig;

        @NameInMap("EffectConfig")
        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig effectConfig;

        @NameInMap("InterveneType")
        public Integer interveneType;

        @NameInMap("NamespaceList")
        public java.util.List<String> namespaceList;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail self = new GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail();
            return TeaModel.build(map, self);
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail setAnswerConfig(java.util.List<GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig> answerConfig) {
            this.answerConfig = answerConfig;
            return this;
        }
        public java.util.List<GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailAnswerConfig> getAnswerConfig() {
            return this.answerConfig;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail setEffectConfig(GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig effectConfig) {
            this.effectConfig = effectConfig;
            return this;
        }
        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetailEffectConfig getEffectConfig() {
            return this.effectConfig;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail setInterveneType(Integer interveneType) {
            this.interveneType = interveneType;
            return this;
        }
        public Integer getInterveneType() {
            return this.interveneType;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail setNamespaceList(java.util.List<String> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetInterveneRuleDetailResponseBodyData extends TeaModel {
        @NameInMap("InterveneRuleDetail")
        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail interveneRuleDetail;

        public static GetInterveneRuleDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneRuleDetailResponseBodyData self = new GetInterveneRuleDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInterveneRuleDetailResponseBodyData setInterveneRuleDetail(GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail interveneRuleDetail) {
            this.interveneRuleDetail = interveneRuleDetail;
            return this;
        }
        public GetInterveneRuleDetailResponseBodyDataInterveneRuleDetail getInterveneRuleDetail() {
            return this.interveneRuleDetail;
        }

    }

}
