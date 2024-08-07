// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasPermissionGroupInfosRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    public static ListSaasPermissionGroupInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSaasPermissionGroupInfosRequest self = new ListSaasPermissionGroupInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListSaasPermissionGroupInfosRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

}
