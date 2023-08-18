// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class AddTaskJobRequest extends TeaModel {
    @NameInMap("nodeIds")
    public java.util.List<String> nodeIds;

    public static AddTaskJobRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTaskJobRequest self = new AddTaskJobRequest();
        return TeaModel.build(map, self);
    }

    public AddTaskJobRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

}
