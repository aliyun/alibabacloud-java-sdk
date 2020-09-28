// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPvCustomSimulationValuesRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    public String pidLoopParameterId;

    @NameInMap("PidLoopId")
    public String pidLoopId;

    public static GetPvCustomSimulationValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPvCustomSimulationValuesRequest self = new GetPvCustomSimulationValuesRequest();
        return TeaModel.build(map, self);
    }

    public GetPvCustomSimulationValuesRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public GetPvCustomSimulationValuesRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
