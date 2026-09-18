// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetAttackTargetRequest extends TeaModel {
    /**
     * <p>The unique identifier of the scan target. If the target does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>target-abc123def4567</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    public static GetAttackTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttackTargetRequest self = new GetAttackTargetRequest();
        return TeaModel.build(map, self);
    }

    public GetAttackTargetRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
