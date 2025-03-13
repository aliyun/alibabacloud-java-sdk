// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetTrainTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1524004782431111</p>
     */
    @NameInMap("aliyunMainId")
    public String aliyunMainId;

    @NameInMap("taskIdList")
    public java.util.List<String> taskIdList;

    public static BatchGetTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTrainTaskRequest self = new BatchGetTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetTrainTaskRequest setAliyunMainId(String aliyunMainId) {
        this.aliyunMainId = aliyunMainId;
        return this;
    }
    public String getAliyunMainId() {
        return this.aliyunMainId;
    }

    public BatchGetTrainTaskRequest setTaskIdList(java.util.List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

}
