// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteCoreWordRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CoreWordName")
    public String coreWordName;

    public static DeleteCoreWordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCoreWordRequest self = new DeleteCoreWordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCoreWordRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteCoreWordRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

}
