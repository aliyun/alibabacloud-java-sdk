// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskConfigRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeCloudbenchTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudbenchTaskConfigRequest self = new DescribeCloudbenchTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudbenchTaskConfigRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
