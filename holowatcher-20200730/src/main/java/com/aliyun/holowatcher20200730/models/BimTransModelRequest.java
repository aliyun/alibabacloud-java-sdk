// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimTransModelRequest extends TeaModel {
    // 任务Id(项目id)
    @NameInMap("TaskId")
    public Long taskId;

    // 转换文件类型
    @NameInMap("Type")
    public String type;

    public static BimTransModelRequest build(java.util.Map<String, ?> map) throws Exception {
        BimTransModelRequest self = new BimTransModelRequest();
        return TeaModel.build(map, self);
    }

    public BimTransModelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public BimTransModelRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
