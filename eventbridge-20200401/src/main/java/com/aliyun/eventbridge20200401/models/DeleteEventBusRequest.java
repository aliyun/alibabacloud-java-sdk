// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventBusRequest extends TeaModel {
    @NameInMap("EventBusName")
    public String eventBusName;

    public static DeleteEventBusRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventBusRequest self = new DeleteEventBusRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventBusRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

}
