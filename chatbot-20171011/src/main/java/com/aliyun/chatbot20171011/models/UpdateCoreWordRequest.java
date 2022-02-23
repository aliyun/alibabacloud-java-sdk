// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateCoreWordRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CoreWordCode")
    public String coreWordCode;

    @NameInMap("CoreWordName")
    public String coreWordName;

    public static UpdateCoreWordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCoreWordRequest self = new UpdateCoreWordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCoreWordRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateCoreWordRequest setCoreWordCode(String coreWordCode) {
        this.coreWordCode = coreWordCode;
        return this;
    }
    public String getCoreWordCode() {
        return this.coreWordCode;
    }

    public UpdateCoreWordRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

}
