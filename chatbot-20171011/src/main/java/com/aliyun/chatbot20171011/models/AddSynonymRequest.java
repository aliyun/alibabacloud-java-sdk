// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AddSynonymRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CoreWordName")
    public String coreWordName;

    @NameInMap("Synonym")
    public String synonym;

    public static AddSynonymRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSynonymRequest self = new AddSynonymRequest();
        return TeaModel.build(map, self);
    }

    public AddSynonymRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public AddSynonymRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

    public AddSynonymRequest setSynonym(String synonym) {
        this.synonym = synonym;
        return this;
    }
    public String getSynonym() {
        return this.synonym;
    }

}
