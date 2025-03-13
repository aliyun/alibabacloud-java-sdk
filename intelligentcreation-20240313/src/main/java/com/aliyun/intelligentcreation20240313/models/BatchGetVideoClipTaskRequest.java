// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetVideoClipTaskRequest extends TeaModel {
    @NameInMap("taskIdList")
    public java.util.List<String> taskIdList;

    public static BatchGetVideoClipTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetVideoClipTaskRequest self = new BatchGetVideoClipTaskRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetVideoClipTaskRequest setTaskIdList(java.util.List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

}
