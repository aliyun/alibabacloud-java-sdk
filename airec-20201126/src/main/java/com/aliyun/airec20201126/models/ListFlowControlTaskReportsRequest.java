// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskReportsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1668268800</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1666195200</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static ListFlowControlTaskReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskReportsRequest self = new ListFlowControlTaskReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskReportsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListFlowControlTaskReportsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
