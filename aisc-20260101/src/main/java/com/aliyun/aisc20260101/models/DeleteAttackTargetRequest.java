// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class DeleteAttackTargetRequest extends TeaModel {
    /**
     * <p>The unique identifier of the scan target. This is the TargetId returned by CreateAttackTarget or ListAttackTargets. If the target does not exist or belongs to another tenant, a 400 error is returned. This prevents exposing whether the resource exists.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>target-abc123def4567</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    public static DeleteAttackTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackTargetRequest self = new DeleteAttackTargetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAttackTargetRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
