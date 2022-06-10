// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateFaqRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 知识的类目ID
    @NameInMap("CategoryId")
    public Long categoryId;

    // 失效时间
    @NameInMap("EndDate")
    public String endDate;

    // 知识ID
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    // 生效时间
    @NameInMap("StartDate")
    public String startDate;

    // 知识标题
    @NameInMap("Title")
    public String title;

    public static UpdateFaqRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaqRequest self = new UpdateFaqRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaqRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateFaqRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateFaqRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateFaqRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public UpdateFaqRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateFaqRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
