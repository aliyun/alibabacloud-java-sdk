// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateLineageRelationshipShrinkRequest extends TeaModel {
    @NameInMap("DstEntity")
    public String dstEntityShrink;

    @NameInMap("SrcEntity")
    public String srcEntityShrink;

    @NameInMap("Task")
    public String taskShrink;

    public static CreateLineageRelationshipShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLineageRelationshipShrinkRequest self = new CreateLineageRelationshipShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLineageRelationshipShrinkRequest setDstEntityShrink(String dstEntityShrink) {
        this.dstEntityShrink = dstEntityShrink;
        return this;
    }
    public String getDstEntityShrink() {
        return this.dstEntityShrink;
    }

    public CreateLineageRelationshipShrinkRequest setSrcEntityShrink(String srcEntityShrink) {
        this.srcEntityShrink = srcEntityShrink;
        return this;
    }
    public String getSrcEntityShrink() {
        return this.srcEntityShrink;
    }

    public CreateLineageRelationshipShrinkRequest setTaskShrink(String taskShrink) {
        this.taskShrink = taskShrink;
        return this;
    }
    public String getTaskShrink() {
        return this.taskShrink;
    }

}
