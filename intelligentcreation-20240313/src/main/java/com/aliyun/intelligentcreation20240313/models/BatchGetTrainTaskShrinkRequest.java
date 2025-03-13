// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetTrainTaskShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1524004782431111</p>
     */
    @NameInMap("aliyunMainId")
    public String aliyunMainId;

    @NameInMap("taskIdList")
    public String taskIdListShrink;

    public static BatchGetTrainTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTrainTaskShrinkRequest self = new BatchGetTrainTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetTrainTaskShrinkRequest setAliyunMainId(String aliyunMainId) {
        this.aliyunMainId = aliyunMainId;
        return this;
    }
    public String getAliyunMainId() {
        return this.aliyunMainId;
    }

    public BatchGetTrainTaskShrinkRequest setTaskIdListShrink(String taskIdListShrink) {
        this.taskIdListShrink = taskIdListShrink;
        return this;
    }
    public String getTaskIdListShrink() {
        return this.taskIdListShrink;
    }

}
