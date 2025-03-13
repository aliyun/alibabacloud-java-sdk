// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetVideoClipTaskShrinkRequest extends TeaModel {
    @NameInMap("taskIdList")
    public String taskIdListShrink;

    public static BatchGetVideoClipTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetVideoClipTaskShrinkRequest self = new BatchGetVideoClipTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetVideoClipTaskShrinkRequest setTaskIdListShrink(String taskIdListShrink) {
        this.taskIdListShrink = taskIdListShrink;
        return this;
    }
    public String getTaskIdListShrink() {
        return this.taskIdListShrink;
    }

}
