// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSimQuestionRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 相似问ID
    @NameInMap("SimQuestionId")
    public Long simQuestionId;

    // 相似问标题，字数上限-120
    @NameInMap("Title")
    public String title;

    public static UpdateSimQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSimQuestionRequest self = new UpdateSimQuestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSimQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateSimQuestionRequest setSimQuestionId(Long simQuestionId) {
        this.simQuestionId = simQuestionId;
        return this;
    }
    public Long getSimQuestionId() {
        return this.simQuestionId;
    }

    public UpdateSimQuestionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
