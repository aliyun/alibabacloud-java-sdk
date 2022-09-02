// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class UpdateTreeNodeRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("Title")
    public String title;

    @NameInMap("TreeNodeId")
    public String treeNodeId;

    public static UpdateTreeNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTreeNodeRequest self = new UpdateTreeNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTreeNodeRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UpdateTreeNodeRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateTreeNodeRequest setTreeNodeId(String treeNodeId) {
        this.treeNodeId = treeNodeId;
        return this;
    }
    public String getTreeNodeId() {
        return this.treeNodeId;
    }

}
