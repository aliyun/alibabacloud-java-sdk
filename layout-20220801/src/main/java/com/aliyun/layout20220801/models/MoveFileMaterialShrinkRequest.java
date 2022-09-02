// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class MoveFileMaterialShrinkRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("MaterialIds")
    public String materialIdsShrink;

    @NameInMap("TargetTreeNodeId")
    public String targetTreeNodeId;

    public static MoveFileMaterialShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveFileMaterialShrinkRequest self = new MoveFileMaterialShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MoveFileMaterialShrinkRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public MoveFileMaterialShrinkRequest setMaterialIdsShrink(String materialIdsShrink) {
        this.materialIdsShrink = materialIdsShrink;
        return this;
    }
    public String getMaterialIdsShrink() {
        return this.materialIdsShrink;
    }

    public MoveFileMaterialShrinkRequest setTargetTreeNodeId(String targetTreeNodeId) {
        this.targetTreeNodeId = targetTreeNodeId;
        return this;
    }
    public String getTargetTreeNodeId() {
        return this.targetTreeNodeId;
    }

}
