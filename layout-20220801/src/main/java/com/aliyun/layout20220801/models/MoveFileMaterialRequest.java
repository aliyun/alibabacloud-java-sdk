// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class MoveFileMaterialRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("MaterialIds")
    public java.util.List<Long> materialIds;

    @NameInMap("TargetTreeNodeId")
    public String targetTreeNodeId;

    public static MoveFileMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveFileMaterialRequest self = new MoveFileMaterialRequest();
        return TeaModel.build(map, self);
    }

    public MoveFileMaterialRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public MoveFileMaterialRequest setMaterialIds(java.util.List<Long> materialIds) {
        this.materialIds = materialIds;
        return this;
    }
    public java.util.List<Long> getMaterialIds() {
        return this.materialIds;
    }

    public MoveFileMaterialRequest setTargetTreeNodeId(String targetTreeNodeId) {
        this.targetTreeNodeId = targetTreeNodeId;
        return this;
    }
    public String getTargetTreeNodeId() {
        return this.targetTreeNodeId;
    }

}
