// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class AddPidLoopToScheduleRequest extends TeaModel {
    @NameInMap("PidLoopIdList")
    @Validation(required = true)
    public java.util.Map<String, ?> pidLoopIdList;

    public static AddPidLoopToScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPidLoopToScheduleRequest self = new AddPidLoopToScheduleRequest();
        return TeaModel.build(map, self);
    }

    public AddPidLoopToScheduleRequest setPidLoopIdList(java.util.Map<String, ?> pidLoopIdList) {
        this.pidLoopIdList = pidLoopIdList;
        return this;
    }
    public java.util.Map<String, ?> getPidLoopIdList() {
        return this.pidLoopIdList;
    }

}
