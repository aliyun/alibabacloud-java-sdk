// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class DeleteTreeNodeRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("TreeNodeId")
    public String treeNodeId;

    public static DeleteTreeNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTreeNodeRequest self = new DeleteTreeNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTreeNodeRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public DeleteTreeNodeRequest setTreeNodeId(String treeNodeId) {
        this.treeNodeId = treeNodeId;
        return this;
    }
    public String getTreeNodeId() {
        return this.treeNodeId;
    }

}
