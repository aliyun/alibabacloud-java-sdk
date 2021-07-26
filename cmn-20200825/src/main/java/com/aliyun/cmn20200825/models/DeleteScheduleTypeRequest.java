// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleTypeRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("ScheduleTypeId")
    public String scheduleTypeId;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteScheduleTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleTypeRequest self = new DeleteScheduleTypeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleTypeRequest setScheduleTypeId(String scheduleTypeId) {
        this.scheduleTypeId = scheduleTypeId;
        return this;
    }
    public String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    public DeleteScheduleTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
