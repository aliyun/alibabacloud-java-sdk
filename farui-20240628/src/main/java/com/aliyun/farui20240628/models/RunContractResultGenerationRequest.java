// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractResultGenerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("assistant")
    public RunContractResultGenerationRequestAssistant assistant;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    public static RunContractResultGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunContractResultGenerationRequest self = new RunContractResultGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunContractResultGenerationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunContractResultGenerationRequest setAssistant(RunContractResultGenerationRequestAssistant assistant) {
        this.assistant = assistant;
        return this;
    }
    public RunContractResultGenerationRequestAssistant getAssistant() {
        return this.assistant;
    }

    public RunContractResultGenerationRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        @NameInMap("ruleDesc")
        public String ruleDesc;

        @NameInMap("ruleTitle")
        public String ruleTitle;

        public static RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules self = new RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules setRuleTitle(String ruleTitle) {
            this.ruleTitle = ruleTitle;
            return this;
        }
        public String getRuleTitle() {
            return this.ruleTitle;
        }

    }

    public static class RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfig extends TeaModel {
        @NameInMap("customRules")
        public java.util.List<RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules> customRules;

        public static RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfig self = new RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfig();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfig setCustomRules(java.util.List<RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules> customRules) {
            this.customRules = customRules;
            return this;
        }
        public java.util.List<RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfigCustomRules> getCustomRules() {
            return this.customRules;
        }

    }

    public static class RunContractResultGenerationRequestAssistantMetaDataRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>2.1</p>
         */
        @NameInMap("ruleSequence")
        public String ruleSequence;

        @NameInMap("ruleTag")
        public String ruleTag;

        @NameInMap("ruleTitle")
        public String ruleTitle;

        public static RunContractResultGenerationRequestAssistantMetaDataRules build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationRequestAssistantMetaDataRules self = new RunContractResultGenerationRequestAssistantMetaDataRules();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationRequestAssistantMetaDataRules setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public RunContractResultGenerationRequestAssistantMetaDataRules setRuleSequence(String ruleSequence) {
            this.ruleSequence = ruleSequence;
            return this;
        }
        public String getRuleSequence() {
            return this.ruleSequence;
        }

        public RunContractResultGenerationRequestAssistantMetaDataRules setRuleTag(String ruleTag) {
            this.ruleTag = ruleTag;
            return this;
        }
        public String getRuleTag() {
            return this.ruleTag;
        }

        public RunContractResultGenerationRequestAssistantMetaDataRules setRuleTitle(String ruleTitle) {
            this.ruleTitle = ruleTitle;
            return this;
        }
        public String getRuleTitle() {
            return this.ruleTitle;
        }

    }

    public static class RunContractResultGenerationRequestAssistantMetaData extends TeaModel {
        @NameInMap("customRuleConfig")
        public RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfig customRuleConfig;

        /**
         * <strong>example:</strong>
         * <p>9a6b1ba60d9944249363ec3cc1529b7b</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("position")
        public String position;

        /**
         * <strong>example:</strong>
         * <p>b265b416-ca1f-425d-9340-c968f39624e1</p>
         */
        @NameInMap("ruleTaskId")
        public String ruleTaskId;

        @NameInMap("rules")
        public java.util.List<RunContractResultGenerationRequestAssistantMetaDataRules> rules;

        public static RunContractResultGenerationRequestAssistantMetaData build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationRequestAssistantMetaData self = new RunContractResultGenerationRequestAssistantMetaData();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationRequestAssistantMetaData setCustomRuleConfig(RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfig customRuleConfig) {
            this.customRuleConfig = customRuleConfig;
            return this;
        }
        public RunContractResultGenerationRequestAssistantMetaDataCustomRuleConfig getCustomRuleConfig() {
            return this.customRuleConfig;
        }

        public RunContractResultGenerationRequestAssistantMetaData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public RunContractResultGenerationRequestAssistantMetaData setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public RunContractResultGenerationRequestAssistantMetaData setRuleTaskId(String ruleTaskId) {
            this.ruleTaskId = ruleTaskId;
            return this;
        }
        public String getRuleTaskId() {
            return this.ruleTaskId;
        }

        public RunContractResultGenerationRequestAssistantMetaData setRules(java.util.List<RunContractResultGenerationRequestAssistantMetaDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<RunContractResultGenerationRequestAssistantMetaDataRules> getRules() {
            return this.rules;
        }

    }

    public static class RunContractResultGenerationRequestAssistant extends TeaModel {
        @NameInMap("metaData")
        public RunContractResultGenerationRequestAssistantMetaData metaData;

        /**
         * <strong>example:</strong>
         * <p>contract_examime</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static RunContractResultGenerationRequestAssistant build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationRequestAssistant self = new RunContractResultGenerationRequestAssistant();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationRequestAssistant setMetaData(RunContractResultGenerationRequestAssistantMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public RunContractResultGenerationRequestAssistantMetaData getMetaData() {
            return this.metaData;
        }

        public RunContractResultGenerationRequestAssistant setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RunContractResultGenerationRequestAssistant setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
