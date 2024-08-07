// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>DS,FAQ</p>
     */
    @NameInMap("SaasGroupCodes")
    public String saasGroupCodes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>userTest</p>
     */
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
