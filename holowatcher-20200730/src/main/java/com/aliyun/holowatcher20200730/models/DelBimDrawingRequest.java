// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DelBimDrawingRequest extends TeaModel {
    // 归类id
    @NameInMap("Id")
    public Long id;

    // taskId
    @NameInMap("TaskId")
    public String taskId;

    public static DelBimDrawingRequest build(java.util.Map<String, ?> map) throws Exception {
        DelBimDrawingRequest self = new DelBimDrawingRequest();
        return TeaModel.build(map, self);
    }

    public DelBimDrawingRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DelBimDrawingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
