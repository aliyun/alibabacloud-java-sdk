// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteFaqRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 知识ID，创建知识该值为空
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static DeleteFaqRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaqRequest self = new DeleteFaqRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaqRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteFaqRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
