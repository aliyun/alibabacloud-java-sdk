// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSolutionRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 答案内容
    @NameInMap("Content")
    public String content;

    // 答案类型
    @NameInMap("ContentType")
    public Integer contentType;

    // 知识ID
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    // 视角code列表
    @NameInMap("PerspectiveCodes")
    public java.util.List<String> perspectiveCodes;

    public static CreateSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSolutionRequest self = new CreateSolutionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSolutionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateSolutionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateSolutionRequest setContentType(Integer contentType) {
        this.contentType = contentType;
        return this;
    }
    public Integer getContentType() {
        return this.contentType;
    }

    public CreateSolutionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public CreateSolutionRequest setPerspectiveCodes(java.util.List<String> perspectiveCodes) {
        this.perspectiveCodes = perspectiveCodes;
        return this;
    }
    public java.util.List<String> getPerspectiveCodes() {
        return this.perspectiveCodes;
    }

}
