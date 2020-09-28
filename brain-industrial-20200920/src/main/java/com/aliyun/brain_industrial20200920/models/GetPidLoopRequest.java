// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidLoopRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static GetPidLoopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPidLoopRequest self = new GetPidLoopRequest();
        return TeaModel.build(map, self);
    }

    public GetPidLoopRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
