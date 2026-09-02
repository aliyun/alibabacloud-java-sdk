// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventStreamingRequest extends TeaModel {
    /**
     * <p>The name of the event stream to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rocketmq-sync</p>
     */
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    /**
     * <p>Specifies whether to force delete the event stream. If set to true, system label-based deletion protection is bypassed. Default value: false.</p>
     */
    @NameInMap("Force")
    public Boolean force;

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

    public DeleteEventStreamingRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
