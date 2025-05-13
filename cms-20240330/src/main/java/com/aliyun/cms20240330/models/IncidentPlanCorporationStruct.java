// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentPlanCorporationStruct extends TeaModel {
    @NameInMap("channel")
    public String channel;

    @NameInMap("robotId")
    public String robotId;

    public static IncidentPlanCorporationStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentPlanCorporationStruct self = new IncidentPlanCorporationStruct();
        return TeaModel.build(map, self);
    }

    public IncidentPlanCorporationStruct setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public IncidentPlanCorporationStruct setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

}
