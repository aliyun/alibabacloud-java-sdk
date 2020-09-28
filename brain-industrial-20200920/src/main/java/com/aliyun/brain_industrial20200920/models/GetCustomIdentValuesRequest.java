// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetCustomIdentValuesRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static GetCustomIdentValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomIdentValuesRequest self = new GetCustomIdentValuesRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomIdentValuesRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public GetCustomIdentValuesRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
