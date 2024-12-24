// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateBusinessLogicRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>businessLogic-AAAAAAAAAGAIyJoP7LbKuA</p>
     */
    @NameInMap("businessLogicIdKey")
    public String businessLogicIdKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    public Long type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateBusinessLogicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessLogicRequest self = new UpdateBusinessLogicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessLogicRequest setBusinessLogicIdKey(String businessLogicIdKey) {
        this.businessLogicIdKey = businessLogicIdKey;
        return this;
    }
    public String getBusinessLogicIdKey() {
        return this.businessLogicIdKey;
    }

    public UpdateBusinessLogicRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBusinessLogicRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public UpdateBusinessLogicRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
