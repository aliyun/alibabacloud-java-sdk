// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RetrieveRunRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assistantId1</p>
     */
    @NameInMap("assistantId")
    public String assistantId;

    /**
     * <strong>example:</strong>
     * <p>assistantId</p>
     */
    @NameInMap("originalAssistantId")
    public String originalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>runId123</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>agentKey1</p>
     */
    @NameInMap("sourceIdOfOriginalAssistantId")
    public String sourceIdOfOriginalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sourceTypeOfOriginalAssistantId")
    public String sourceTypeOfOriginalAssistantId;

    public static RetrieveRunRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveRunRequest self = new RetrieveRunRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveRunRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public RetrieveRunRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public RetrieveRunRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public RetrieveRunRequest setSourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
        this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
        return this;
    }
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    public RetrieveRunRequest setSourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
        this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
        return this;
    }
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

}
