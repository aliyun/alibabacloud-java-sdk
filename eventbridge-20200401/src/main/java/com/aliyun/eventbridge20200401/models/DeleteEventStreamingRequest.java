// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventStreamingRequest extends TeaModel {
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    public static DeleteEventStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventStreamingRequest self = new DeleteEventStreamingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventStreamingRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

}
