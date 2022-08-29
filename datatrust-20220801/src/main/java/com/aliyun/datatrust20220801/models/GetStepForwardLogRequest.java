// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetStepForwardLogRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("Role")
    public Integer role;

    @NameInMap("Start")
    public Long start;

    @NameInMap("Step")
    public Integer step;

    public static GetStepForwardLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStepForwardLogRequest self = new GetStepForwardLogRequest();
        return TeaModel.build(map, self);
    }

    public GetStepForwardLogRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetStepForwardLogRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetStepForwardLogRequest setRole(Integer role) {
        this.role = role;
        return this;
    }
    public Integer getRole() {
        return this.role;
    }

    public GetStepForwardLogRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public GetStepForwardLogRequest setStep(Integer step) {
        this.step = step;
        return this;
    }
    public Integer getStep() {
        return this.step;
    }

}
