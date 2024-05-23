// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateViewPointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ReferenceData")
    public GenerateViewPointRequestReferenceData referenceData;

    public static GenerateViewPointRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateViewPointRequest self = new GenerateViewPointRequest();
        return TeaModel.build(map, self);
    }

    public GenerateViewPointRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateViewPointRequest setReferenceData(GenerateViewPointRequestReferenceData referenceData) {
        this.referenceData = referenceData;
        return this;
    }
    public GenerateViewPointRequestReferenceData getReferenceData() {
        return this.referenceData;
    }

    public static class GenerateViewPointRequestReferenceData extends TeaModel {
        @NameInMap("MiniDoc")
        public java.util.List<String> miniDoc;

        public static GenerateViewPointRequestReferenceData build(java.util.Map<String, ?> map) throws Exception {
            GenerateViewPointRequestReferenceData self = new GenerateViewPointRequestReferenceData();
            return TeaModel.build(map, self);
        }

        public GenerateViewPointRequestReferenceData setMiniDoc(java.util.List<String> miniDoc) {
            this.miniDoc = miniDoc;
            return this;
        }
        public java.util.List<String> getMiniDoc() {
            return this.miniDoc;
        }

    }

}
