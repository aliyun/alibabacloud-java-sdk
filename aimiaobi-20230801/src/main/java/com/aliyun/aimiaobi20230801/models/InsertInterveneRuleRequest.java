// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("InterveneRuleConfig")
    public InsertInterveneRuleRequestInterveneRuleConfig interveneRuleConfig;

    public static InsertInterveneRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertInterveneRuleRequest self = new InsertInterveneRuleRequest();
        return TeaModel.build(map, self);
    }

    public InsertInterveneRuleRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public InsertInterveneRuleRequest setInterveneRuleConfig(InsertInterveneRuleRequestInterveneRuleConfig interveneRuleConfig) {
        this.interveneRuleConfig = interveneRuleConfig;
        return this;
    }
    public InsertInterveneRuleRequestInterveneRuleConfig getInterveneRuleConfig() {
        return this.interveneRuleConfig;
    }

    public static class InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnswerType")
        public Integer answerType;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>namespace_qa_query</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        public static InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig build(java.util.Map<String, ?> map) throws Exception {
            InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig self = new InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig();
            return TeaModel.build(map, self);
        }

        public InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig setAnswerType(Integer answerType) {
            this.answerType = answerType;
            return this;
        }
        public Integer getAnswerType() {
            return this.answerType;
        }

        public InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class InsertInterveneRuleRequestInterveneRuleConfigEffectConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EffectType")
        public Integer effectType;

        /**
         * <strong>example:</strong>
         * <p>2023-03-28 06:04:29</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2023-03-28 06:04:29</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static InsertInterveneRuleRequestInterveneRuleConfigEffectConfig build(java.util.Map<String, ?> map) throws Exception {
            InsertInterveneRuleRequestInterveneRuleConfigEffectConfig self = new InsertInterveneRuleRequestInterveneRuleConfigEffectConfig();
            return TeaModel.build(map, self);
        }

        public InsertInterveneRuleRequestInterveneRuleConfigEffectConfig setEffectType(Integer effectType) {
            this.effectType = effectType;
            return this;
        }
        public Integer getEffectType() {
            return this.effectType;
        }

        public InsertInterveneRuleRequestInterveneRuleConfigEffectConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public InsertInterveneRuleRequestInterveneRuleConfigEffectConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList extends TeaModel {
        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>37249</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OperationType")
        public Integer operationType;

        @NameInMap("Query")
        public String query;

        public static InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList build(java.util.Map<String, ?> map) throws Exception {
            InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList self = new InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList();
            return TeaModel.build(map, self);
        }

        public InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList setOperationType(Integer operationType) {
            this.operationType = operationType;
            return this;
        }
        public Integer getOperationType() {
            return this.operationType;
        }

        public InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class InsertInterveneRuleRequestInterveneRuleConfig extends TeaModel {
        @NameInMap("AnswerConfig")
        public java.util.List<InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig> answerConfig;

        @NameInMap("EffectConfig")
        public InsertInterveneRuleRequestInterveneRuleConfigEffectConfig effectConfig;

        @NameInMap("InterveneConfigList")
        public java.util.List<InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList> interveneConfigList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InterveneType")
        public Integer interveneType;

        @NameInMap("NamespaceList")
        public java.util.List<String> namespaceList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <strong>example:</strong>
         * <p>tf-test-rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static InsertInterveneRuleRequestInterveneRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            InsertInterveneRuleRequestInterveneRuleConfig self = new InsertInterveneRuleRequestInterveneRuleConfig();
            return TeaModel.build(map, self);
        }

        public InsertInterveneRuleRequestInterveneRuleConfig setAnswerConfig(java.util.List<InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig> answerConfig) {
            this.answerConfig = answerConfig;
            return this;
        }
        public java.util.List<InsertInterveneRuleRequestInterveneRuleConfigAnswerConfig> getAnswerConfig() {
            return this.answerConfig;
        }

        public InsertInterveneRuleRequestInterveneRuleConfig setEffectConfig(InsertInterveneRuleRequestInterveneRuleConfigEffectConfig effectConfig) {
            this.effectConfig = effectConfig;
            return this;
        }
        public InsertInterveneRuleRequestInterveneRuleConfigEffectConfig getEffectConfig() {
            return this.effectConfig;
        }

        public InsertInterveneRuleRequestInterveneRuleConfig setInterveneConfigList(java.util.List<InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList> interveneConfigList) {
            this.interveneConfigList = interveneConfigList;
            return this;
        }
        public java.util.List<InsertInterveneRuleRequestInterveneRuleConfigInterveneConfigList> getInterveneConfigList() {
            return this.interveneConfigList;
        }

        public InsertInterveneRuleRequestInterveneRuleConfig setInterveneType(Integer interveneType) {
            this.interveneType = interveneType;
            return this;
        }
        public Integer getInterveneType() {
            return this.interveneType;
        }

        public InsertInterveneRuleRequestInterveneRuleConfig setNamespaceList(java.util.List<String> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

        public InsertInterveneRuleRequestInterveneRuleConfig setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public InsertInterveneRuleRequestInterveneRuleConfig setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
