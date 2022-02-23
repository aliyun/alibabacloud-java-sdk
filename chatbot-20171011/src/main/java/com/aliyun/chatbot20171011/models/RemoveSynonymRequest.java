// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RemoveSynonymRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CoreWordName")
    public String coreWordName;

    @NameInMap("Synonym")
    public String synonym;

    public static RemoveSynonymRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSynonymRequest self = new RemoveSynonymRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSynonymRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public RemoveSynonymRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

    public RemoveSynonymRequest setSynonym(String synonym) {
        this.synonym = synonym;
        return this;
    }
    public String getSynonym() {
        return this.synonym;
    }

}
