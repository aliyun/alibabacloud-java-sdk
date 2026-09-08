// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutEventsShrinkRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-bus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The list of events.</p>
     */
    @NameInMap("EventList")
    public String eventListShrink;

    public static PutEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEventsShrinkRequest self = new PutEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PutEventsShrinkRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public PutEventsShrinkRequest setEventListShrink(String eventListShrink) {
        this.eventListShrink = eventListShrink;
        return this;
    }
    public String getEventListShrink() {
        return this.eventListShrink;
    }

}
