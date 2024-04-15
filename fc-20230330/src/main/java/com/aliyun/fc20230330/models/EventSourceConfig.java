// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EventSourceConfig extends TeaModel {
    @NameInMap("eventSourceParameters")
    public EventSourceParameters eventSourceParameters;

    @NameInMap("eventSourceType")
    public String eventSourceType;

    public static EventSourceConfig build(java.util.Map<String, ?> map) throws Exception {
        EventSourceConfig self = new EventSourceConfig();
        return TeaModel.build(map, self);
    }

    public EventSourceConfig setEventSourceParameters(EventSourceParameters eventSourceParameters) {
        this.eventSourceParameters = eventSourceParameters;
        return this;
    }
    public EventSourceParameters getEventSourceParameters() {
        return this.eventSourceParameters;
    }

    public EventSourceConfig setEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
        return this;
    }
    public String getEventSourceType() {
        return this.eventSourceType;
    }

}
