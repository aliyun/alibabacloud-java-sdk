// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSolutionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentType")
    public Integer contentType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PerspectiveCodes")
    public java.util.List<String> perspectiveCodes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100001333260</p>
     */
    @NameInMap("SolutionId")
    public Long solutionId;

    public static UpdateSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionRequest self = new UpdateSolutionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateSolutionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateSolutionRequest setContentType(Integer contentType) {
        this.contentType = contentType;
        return this;
    }
    public Integer getContentType() {
        return this.contentType;
    }

    public UpdateSolutionRequest setPerspectiveCodes(java.util.List<String> perspectiveCodes) {
        this.perspectiveCodes = perspectiveCodes;
        return this;
    }
    public java.util.List<String> getPerspectiveCodes() {
        return this.perspectiveCodes;
    }

    public UpdateSolutionRequest setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public Long getSolutionId() {
        return this.solutionId;
    }

}
