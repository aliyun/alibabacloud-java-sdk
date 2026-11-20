// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SelectedDataStrategy extends TeaModel {
    /**
     * <p>The end time of the statistical window in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The list of evaluation IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;2646a9380bba3c86371f55a0226322941794983634&quot;]</p>
     */
    @NameInMap("evalIds")
    public java.util.List<String> evalIds;

    /**
     * <p>The estimated start time in milliseconds.</p>
     * <blockquote>
     * <p>You can modify this parameter only when the course is in the preview state.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1735574400</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static SelectedDataStrategy build(java.util.Map<String, ?> map) throws Exception {
        SelectedDataStrategy self = new SelectedDataStrategy();
        return TeaModel.build(map, self);
    }

    public SelectedDataStrategy setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SelectedDataStrategy setEvalIds(java.util.List<String> evalIds) {
        this.evalIds = evalIds;
        return this;
    }
    public java.util.List<String> getEvalIds() {
        return this.evalIds;
    }

    public SelectedDataStrategy setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
