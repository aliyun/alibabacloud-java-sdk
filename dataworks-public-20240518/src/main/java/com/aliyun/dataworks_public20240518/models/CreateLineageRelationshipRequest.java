// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateLineageRelationshipRequest extends TeaModel {
    @NameInMap("DstEntity")
    public LineageEntity dstEntity;

    @NameInMap("SrcEntity")
    public LineageEntity srcEntity;

    @NameInMap("Task")
    public LineageTask task;

    public static CreateLineageRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLineageRelationshipRequest self = new CreateLineageRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public CreateLineageRelationshipRequest setDstEntity(LineageEntity dstEntity) {
        this.dstEntity = dstEntity;
        return this;
    }
    public LineageEntity getDstEntity() {
        return this.dstEntity;
    }

    public CreateLineageRelationshipRequest setSrcEntity(LineageEntity srcEntity) {
        this.srcEntity = srcEntity;
        return this;
    }
    public LineageEntity getSrcEntity() {
        return this.srcEntity;
    }

    public CreateLineageRelationshipRequest setTask(LineageTask task) {
        this.task = task;
        return this;
    }
    public LineageTask getTask() {
        return this.task;
    }

}
