// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PauseEventStreamingRequest extends TeaModel {
    /**
     * <p>The name of the event stream that you want to stop.</p>
     */
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    public static PauseEventStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseEventStreamingRequest self = new PauseEventStreamingRequest();
        return TeaModel.build(map, self);
    }

    public PauseEventStreamingRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

}
