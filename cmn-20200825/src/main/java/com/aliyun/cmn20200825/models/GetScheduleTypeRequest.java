// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleTypeRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("ScheduleTypeId")
    public String scheduleTypeId;

    public static GetScheduleTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleTypeRequest self = new GetScheduleTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduleTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetScheduleTypeRequest setScheduleTypeId(String scheduleTypeId) {
        this.scheduleTypeId = scheduleTypeId;
        return this;
    }
    public String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

}
