// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateStageModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Model Description</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StageAlias")
    public String stageAlias;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static CreateStageModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStageModelRequest self = new CreateStageModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateStageModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStageModelRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateStageModelRequest setStageAlias(String stageAlias) {
        this.stageAlias = stageAlias;
        return this;
    }
    public String getStageAlias() {
        return this.stageAlias;
    }

    public CreateStageModelRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
