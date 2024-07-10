// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractRuleGenerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("assistant")
    public RunContractRuleGenerationRequestAssistant assistant;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    public static RunContractRuleGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunContractRuleGenerationRequest self = new RunContractRuleGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunContractRuleGenerationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunContractRuleGenerationRequest setAssistant(RunContractRuleGenerationRequestAssistant assistant) {
        this.assistant = assistant;
        return this;
    }
    public RunContractRuleGenerationRequestAssistant getAssistant() {
        return this.assistant;
    }

    public RunContractRuleGenerationRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class RunContractRuleGenerationRequestAssistantMetaData extends TeaModel {
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

        public static RunContractRuleGenerationRequestAssistantMetaData build(java.util.Map<String, ?> map) throws Exception {
            RunContractRuleGenerationRequestAssistantMetaData self = new RunContractRuleGenerationRequestAssistantMetaData();
            return TeaModel.build(map, self);
        }

        public RunContractRuleGenerationRequestAssistantMetaData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public RunContractRuleGenerationRequestAssistantMetaData setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

    public static class RunContractRuleGenerationRequestAssistant extends TeaModel {
        @NameInMap("metaData")
        public RunContractRuleGenerationRequestAssistantMetaData metaData;

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

        public static RunContractRuleGenerationRequestAssistant build(java.util.Map<String, ?> map) throws Exception {
            RunContractRuleGenerationRequestAssistant self = new RunContractRuleGenerationRequestAssistant();
            return TeaModel.build(map, self);
        }

        public RunContractRuleGenerationRequestAssistant setMetaData(RunContractRuleGenerationRequestAssistantMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public RunContractRuleGenerationRequestAssistantMetaData getMetaData() {
            return this.metaData;
        }

        public RunContractRuleGenerationRequestAssistant setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RunContractRuleGenerationRequestAssistant setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
