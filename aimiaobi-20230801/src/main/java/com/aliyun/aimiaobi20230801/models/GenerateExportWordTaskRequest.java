// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateExportWordTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GeneratedContentId")
    public Long generatedContentId;

    public static GenerateExportWordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateExportWordTaskRequest self = new GenerateExportWordTaskRequest();
        return TeaModel.build(map, self);
    }

    public GenerateExportWordTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateExportWordTaskRequest setGeneratedContentId(Long generatedContentId) {
        this.generatedContentId = generatedContentId;
        return this;
    }
    public Long getGeneratedContentId() {
        return this.generatedContentId;
    }

}
