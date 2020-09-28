// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class AddParameterToPidLoopRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("AdjustType")
    @Validation(required = true)
    public Integer adjustType;

    @NameInMap("ModelDistinguish")
    public java.util.Map<String, ?> modelDistinguish;

    @NameInMap("ParameterTuning")
    public java.util.Map<String, ?> parameterTuning;

    public static AddParameterToPidLoopRequest build(java.util.Map<String, ?> map) throws Exception {
        AddParameterToPidLoopRequest self = new AddParameterToPidLoopRequest();
        return TeaModel.build(map, self);
    }

    public AddParameterToPidLoopRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public AddParameterToPidLoopRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public AddParameterToPidLoopRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public AddParameterToPidLoopRequest setAdjustType(Integer adjustType) {
        this.adjustType = adjustType;
        return this;
    }
    public Integer getAdjustType() {
        return this.adjustType;
    }

    public AddParameterToPidLoopRequest setModelDistinguish(java.util.Map<String, ?> modelDistinguish) {
        this.modelDistinguish = modelDistinguish;
        return this;
    }
    public java.util.Map<String, ?> getModelDistinguish() {
        return this.modelDistinguish;
    }

    public AddParameterToPidLoopRequest setParameterTuning(java.util.Map<String, ?> parameterTuning) {
        this.parameterTuning = parameterTuning;
        return this;
    }
    public java.util.Map<String, ?> getParameterTuning() {
        return this.parameterTuning;
    }

}
