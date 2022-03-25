// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimStandardDetailRequest extends TeaModel {
    // 标准图纸id
    @NameInMap("StandardId")
    public String standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static BimStandardDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        BimStandardDetailRequest self = new BimStandardDetailRequest();
        return TeaModel.build(map, self);
    }

    public BimStandardDetailRequest setStandardId(String standardId) {
        this.standardId = standardId;
        return this;
    }
    public String getStandardId() {
        return this.standardId;
    }

    public BimStandardDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
