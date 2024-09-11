// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteCustomTopicViewPointByIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dfd73894e6a94fd79fe7ffbe865796fb</p>
     */
    @NameInMap("CustomViewPointId")
    public String customViewPointId;

    public static DeleteCustomTopicViewPointByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTopicViewPointByIdRequest self = new DeleteCustomTopicViewPointByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTopicViewPointByIdRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteCustomTopicViewPointByIdRequest setCustomViewPointId(String customViewPointId) {
        this.customViewPointId = customViewPointId;
        return this;
    }
    public String getCustomViewPointId() {
        return this.customViewPointId;
    }

}
