// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingRenderRequest extends TeaModel {
    // 源图纸id
    @NameInMap("DrawingId")
    public Long drawingId;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimDrawingRenderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingRenderRequest self = new GetBimDrawingRenderRequest();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingRenderRequest setDrawingId(Long drawingId) {
        this.drawingId = drawingId;
        return this;
    }
    public Long getDrawingId() {
        return this.drawingId;
    }

    public GetBimDrawingRenderRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
