// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimFragmentListRequest extends TeaModel {
    @NameInMap("DrawingId")
    public Long drawingId;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimFragmentListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimFragmentListRequest self = new GetBimFragmentListRequest();
        return TeaModel.build(map, self);
    }

    public GetBimFragmentListRequest setDrawingId(Long drawingId) {
        this.drawingId = drawingId;
        return this;
    }
    public Long getDrawingId() {
        return this.drawingId;
    }

    public GetBimFragmentListRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
