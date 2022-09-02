// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class MoveTreeNodeRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("CurrentTreeNodeId")
    public String currentTreeNodeId;

    @NameInMap("TargetParentId")
    public String targetParentId;

    @NameInMap("TargetTreeNodeIndex")
    public String targetTreeNodeIndex;

    @NameInMap("Type")
    public String type;

    public static MoveTreeNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveTreeNodeRequest self = new MoveTreeNodeRequest();
        return TeaModel.build(map, self);
    }

    public MoveTreeNodeRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public MoveTreeNodeRequest setCurrentTreeNodeId(String currentTreeNodeId) {
        this.currentTreeNodeId = currentTreeNodeId;
        return this;
    }
    public String getCurrentTreeNodeId() {
        return this.currentTreeNodeId;
    }

    public MoveTreeNodeRequest setTargetParentId(String targetParentId) {
        this.targetParentId = targetParentId;
        return this;
    }
    public String getTargetParentId() {
        return this.targetParentId;
    }

    public MoveTreeNodeRequest setTargetTreeNodeIndex(String targetTreeNodeIndex) {
        this.targetTreeNodeIndex = targetTreeNodeIndex;
        return this;
    }
    public String getTargetTreeNodeIndex() {
        return this.targetTreeNodeIndex;
    }

    public MoveTreeNodeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
