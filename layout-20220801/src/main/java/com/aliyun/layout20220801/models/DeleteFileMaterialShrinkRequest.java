// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class DeleteFileMaterialShrinkRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("MaterialIds")
    public String materialIdsShrink;

    @NameInMap("TreeNodeId")
    public String treeNodeId;

    public static DeleteFileMaterialShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileMaterialShrinkRequest self = new DeleteFileMaterialShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileMaterialShrinkRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public DeleteFileMaterialShrinkRequest setMaterialIdsShrink(String materialIdsShrink) {
        this.materialIdsShrink = materialIdsShrink;
        return this;
    }
    public String getMaterialIdsShrink() {
        return this.materialIdsShrink;
    }

    public DeleteFileMaterialShrinkRequest setTreeNodeId(String treeNodeId) {
        this.treeNodeId = treeNodeId;
        return this;
    }
    public String getTreeNodeId() {
        return this.treeNodeId;
    }

}
