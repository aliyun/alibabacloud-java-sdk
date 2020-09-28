// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidLoopParameterRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static GetPidLoopParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPidLoopParameterRequest self = new GetPidLoopParameterRequest();
        return TeaModel.build(map, self);
    }

    public GetPidLoopParameterRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public GetPidLoopParameterRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
