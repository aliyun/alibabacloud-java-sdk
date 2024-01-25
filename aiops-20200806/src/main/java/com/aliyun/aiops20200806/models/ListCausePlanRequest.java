// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListCausePlanRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RootCauseId")
    public String rootCauseId;

    public static ListCausePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCausePlanRequest self = new ListCausePlanRequest();
        return TeaModel.build(map, self);
    }

    public ListCausePlanRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ListCausePlanRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCausePlanRequest setRootCauseId(String rootCauseId) {
        this.rootCauseId = rootCauseId;
        return this;
    }
    public String getRootCauseId() {
        return this.rootCauseId;
    }

}
