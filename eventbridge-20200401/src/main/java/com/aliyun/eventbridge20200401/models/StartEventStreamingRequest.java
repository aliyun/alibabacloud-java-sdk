// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class StartEventStreamingRequest extends TeaModel {
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    public static StartEventStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartEventStreamingRequest self = new StartEventStreamingRequest();
        return TeaModel.build(map, self);
    }

    public StartEventStreamingRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

}
