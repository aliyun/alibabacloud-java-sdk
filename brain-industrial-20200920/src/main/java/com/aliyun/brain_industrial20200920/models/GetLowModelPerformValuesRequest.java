// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetLowModelPerformValuesRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static GetLowModelPerformValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLowModelPerformValuesRequest self = new GetLowModelPerformValuesRequest();
        return TeaModel.build(map, self);
    }

    public GetLowModelPerformValuesRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public GetLowModelPerformValuesRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
