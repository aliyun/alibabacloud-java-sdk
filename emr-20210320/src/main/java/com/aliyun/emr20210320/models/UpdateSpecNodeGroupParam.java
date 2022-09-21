// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateSpecNodeGroupParam extends TeaModel {
    @NameInMap("NewInstanceType")
    public String newInstanceType;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    public static UpdateSpecNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpecNodeGroupParam self = new UpdateSpecNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public UpdateSpecNodeGroupParam setNewInstanceType(String newInstanceType) {
        this.newInstanceType = newInstanceType;
        return this;
    }
    public String getNewInstanceType() {
        return this.newInstanceType;
    }

    public UpdateSpecNodeGroupParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
