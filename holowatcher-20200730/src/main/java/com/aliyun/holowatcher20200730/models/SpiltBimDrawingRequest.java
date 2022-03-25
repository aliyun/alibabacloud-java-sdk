// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class SpiltBimDrawingRequest extends TeaModel {
    // A short description of struct
    @NameInMap("DrawingId")
    public Long drawingId;

    @NameInMap("TaskId")
    public Long taskId;

    public static SpiltBimDrawingRequest build(java.util.Map<String, ?> map) throws Exception {
        SpiltBimDrawingRequest self = new SpiltBimDrawingRequest();
        return TeaModel.build(map, self);
    }

    public SpiltBimDrawingRequest setDrawingId(Long drawingId) {
        this.drawingId = drawingId;
        return this;
    }
    public Long getDrawingId() {
        return this.drawingId;
    }

    public SpiltBimDrawingRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
