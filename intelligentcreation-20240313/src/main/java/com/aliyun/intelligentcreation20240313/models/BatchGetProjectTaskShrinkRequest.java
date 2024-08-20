// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetProjectTaskShrinkRequest extends TeaModel {
    @NameInMap("taskIdList")
    public String taskIdListShrink;

    public static BatchGetProjectTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetProjectTaskShrinkRequest self = new BatchGetProjectTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetProjectTaskShrinkRequest setTaskIdListShrink(String taskIdListShrink) {
        this.taskIdListShrink = taskIdListShrink;
        return this;
    }
    public String getTaskIdListShrink() {
        return this.taskIdListShrink;
    }

}
