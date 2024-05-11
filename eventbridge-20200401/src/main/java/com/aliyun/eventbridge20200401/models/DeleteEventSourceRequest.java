// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventSourceRequest extends TeaModel {
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventSourceName")
    public String eventSourceName;

    public static DeleteEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventSourceRequest self = new DeleteEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventSourceRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public DeleteEventSourceRequest setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public String getEventSourceName() {
        return this.eventSourceName;
    }

}
