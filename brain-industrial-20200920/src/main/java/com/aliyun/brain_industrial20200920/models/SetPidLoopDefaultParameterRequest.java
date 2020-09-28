// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class SetPidLoopDefaultParameterRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    public static SetPidLoopDefaultParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPidLoopDefaultParameterRequest self = new SetPidLoopDefaultParameterRequest();
        return TeaModel.build(map, self);
    }

    public SetPidLoopDefaultParameterRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public SetPidLoopDefaultParameterRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

}
