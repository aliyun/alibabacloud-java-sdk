// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetEventStreamingRequest extends TeaModel {
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    public static GetEventStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventStreamingRequest self = new GetEventStreamingRequest();
        return TeaModel.build(map, self);
    }

    public GetEventStreamingRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

}
