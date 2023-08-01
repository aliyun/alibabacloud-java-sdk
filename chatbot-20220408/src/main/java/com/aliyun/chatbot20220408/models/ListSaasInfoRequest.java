// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasInfoRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("SaasGroupCodes")
    public String saasGroupCodes;

    @NameInMap("SaasName")
    public String saasName;

    public static ListSaasInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSaasInfoRequest self = new ListSaasInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListSaasInfoRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListSaasInfoRequest setSaasGroupCodes(String saasGroupCodes) {
        this.saasGroupCodes = saasGroupCodes;
        return this;
    }
    public String getSaasGroupCodes() {
        return this.saasGroupCodes;
    }

    public ListSaasInfoRequest setSaasName(String saasName) {
        this.saasName = saasName;
        return this;
    }
    public String getSaasName() {
        return this.saasName;
    }

}
