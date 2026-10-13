// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasPermissionGroupInfosRequest extends TeaModel {
    /**
     * <p>The business workspace key. If this parameter is not specified, the default business workspace is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
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
