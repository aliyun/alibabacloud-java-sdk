// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleDutyRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // scheduleDutyId
    @NameInMap("ScheduleDutyId")
    public String scheduleDutyId;

    public static GetScheduleDutyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleDutyRequest self = new GetScheduleDutyRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduleDutyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetScheduleDutyRequest setScheduleDutyId(String scheduleDutyId) {
        this.scheduleDutyId = scheduleDutyId;
        return this;
    }
    public String getScheduleDutyId() {
        return this.scheduleDutyId;
    }

}
