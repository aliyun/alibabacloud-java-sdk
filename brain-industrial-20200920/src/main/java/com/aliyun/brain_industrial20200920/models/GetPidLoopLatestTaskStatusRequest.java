// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidLoopLatestTaskStatusRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static GetPidLoopLatestTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPidLoopLatestTaskStatusRequest self = new GetPidLoopLatestTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPidLoopLatestTaskStatusRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public GetPidLoopLatestTaskStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetPidLoopLatestTaskStatusRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
