// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetProjectTaskRequest extends TeaModel {
    @NameInMap("taskIdList")
    public java.util.List<String> taskIdList;

    public static BatchGetProjectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetProjectTaskRequest self = new BatchGetProjectTaskRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetProjectTaskRequest setTaskIdList(java.util.List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

}
