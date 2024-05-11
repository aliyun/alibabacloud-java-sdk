// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventBusRequest extends TeaModel {
    /**
     * <p>The description of the event bus.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event bus.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    public static CreateEventBusRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventBusRequest self = new CreateEventBusRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventBusRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEventBusRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

}
