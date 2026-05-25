// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyStageModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageAlias")
    public String stageAlias;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdljflsjflj324xxx</p>
     */
    @NameInMap("StageModelId")
    public String stageModelId;

    public static ModifyStageModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStageModelRequest self = new ModifyStageModelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStageModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyStageModelRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyStageModelRequest setStageAlias(String stageAlias) {
        this.stageAlias = stageAlias;
        return this;
    }
    public String getStageAlias() {
        return this.stageAlias;
    }

    public ModifyStageModelRequest setStageModelId(String stageModelId) {
        this.stageModelId = stageModelId;
        return this;
    }
    public String getStageModelId() {
        return this.stageModelId;
    }

}
