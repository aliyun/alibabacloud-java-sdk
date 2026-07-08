// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteMaterialByIdRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd327c3d5d5e44159cc716e23bfa530e_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The primary key ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteMaterialByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialByIdRequest self = new DeleteMaterialByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialByIdRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteMaterialByIdRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
