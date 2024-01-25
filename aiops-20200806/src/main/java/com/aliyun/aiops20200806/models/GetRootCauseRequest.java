// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRootCauseRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RootCauseId")
    public String rootCauseId;

    public static GetRootCauseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRootCauseRequest self = new GetRootCauseRequest();
        return TeaModel.build(map, self);
    }

    public GetRootCauseRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetRootCauseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRootCauseRequest setRootCauseId(String rootCauseId) {
        this.rootCauseId = rootCauseId;
        return this;
    }
    public String getRootCauseId() {
        return this.rootCauseId;
    }

}
