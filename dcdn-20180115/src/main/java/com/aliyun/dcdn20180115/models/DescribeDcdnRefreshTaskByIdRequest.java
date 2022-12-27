// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTaskByIdRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeDcdnRefreshTaskByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshTaskByIdRequest self = new DescribeDcdnRefreshTaskByIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshTaskByIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
