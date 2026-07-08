// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteGeneratedContentRequest extends TeaModel {
    /**
     * <p>Unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Unique identifier of the document</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGeneratedContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGeneratedContentRequest self = new DeleteGeneratedContentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGeneratedContentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteGeneratedContentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteGeneratedContentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
