// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateSpecNodeGroup extends TeaModel {
    @NameInMap("NewInstanceType")
    public String newInstanceType;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    public static UpdateSpecNodeGroup build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpecNodeGroup self = new UpdateSpecNodeGroup();
        return TeaModel.build(map, self);
    }

    public UpdateSpecNodeGroup setNewInstanceType(String newInstanceType) {
        this.newInstanceType = newInstanceType;
        return this;
    }
    public String getNewInstanceType() {
        return this.newInstanceType;
    }

    public UpdateSpecNodeGroup setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
