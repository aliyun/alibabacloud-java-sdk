// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteStageModelRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3294sdufo3nenexxx</p>
     */
    @NameInMap("StageModelId")
    public String stageModelId;

    public static DeleteStageModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStageModelRequest self = new DeleteStageModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStageModelRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteStageModelRequest setStageModelId(String stageModelId) {
        this.stageModelId = stageModelId;
        return this;
    }
    public String getStageModelId() {
        return this.stageModelId;
    }

}
