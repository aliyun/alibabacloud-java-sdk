// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingDetailRequest extends TeaModel {
    @NameInMap("DrawingId")
    public Long drawingId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimDrawingDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingDetailRequest self = new GetBimDrawingDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingDetailRequest setDrawingId(Long drawingId) {
        this.drawingId = drawingId;
        return this;
    }
    public Long getDrawingId() {
        return this.drawingId;
    }

    public GetBimDrawingDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
