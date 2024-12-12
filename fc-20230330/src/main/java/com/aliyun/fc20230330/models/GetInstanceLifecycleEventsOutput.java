// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetInstanceLifecycleEventsOutput extends TeaModel {
    @NameInMap("events")
    public java.util.List<InstanceEventItem> events;

    @NameInMap("requestId")
    public String requestId;

    public static GetInstanceLifecycleEventsOutput build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLifecycleEventsOutput self = new GetInstanceLifecycleEventsOutput();
        return TeaModel.build(map, self);
    }

    public GetInstanceLifecycleEventsOutput setEvents(java.util.List<InstanceEventItem> events) {
        this.events = events;
        return this;
    }
    public java.util.List<InstanceEventItem> getEvents() {
        return this.events;
    }

    public GetInstanceLifecycleEventsOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
