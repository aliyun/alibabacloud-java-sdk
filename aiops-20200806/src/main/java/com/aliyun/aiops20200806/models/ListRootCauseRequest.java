// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListRootCauseRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RootCauseId")
    public String rootCauseId;

    public static ListRootCauseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRootCauseRequest self = new ListRootCauseRequest();
        return TeaModel.build(map, self);
    }

    public ListRootCauseRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ListRootCauseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRootCauseRequest setRootCauseId(String rootCauseId) {
        this.rootCauseId = rootCauseId;
        return this;
    }
    public String getRootCauseId() {
        return this.rootCauseId;
    }

}
