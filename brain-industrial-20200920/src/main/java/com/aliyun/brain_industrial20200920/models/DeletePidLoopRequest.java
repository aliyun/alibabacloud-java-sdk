// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class DeletePidLoopRequest extends TeaModel {
    @NameInMap("PidLoopId")
    public String pidLoopId;

    public static DeletePidLoopRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePidLoopRequest self = new DeletePidLoopRequest();
        return TeaModel.build(map, self);
    }

    public DeletePidLoopRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
