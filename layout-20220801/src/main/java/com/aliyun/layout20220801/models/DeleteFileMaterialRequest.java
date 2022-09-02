// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class DeleteFileMaterialRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("MaterialIds")
    public java.util.List<Long> materialIds;

    @NameInMap("TreeNodeId")
    public String treeNodeId;

    public static DeleteFileMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileMaterialRequest self = new DeleteFileMaterialRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileMaterialRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public DeleteFileMaterialRequest setMaterialIds(java.util.List<Long> materialIds) {
        this.materialIds = materialIds;
        return this;
    }
    public java.util.List<Long> getMaterialIds() {
        return this.materialIds;
    }

    public DeleteFileMaterialRequest setTreeNodeId(String treeNodeId) {
        this.treeNodeId = treeNodeId;
        return this;
    }
    public String getTreeNodeId() {
        return this.treeNodeId;
    }

}
