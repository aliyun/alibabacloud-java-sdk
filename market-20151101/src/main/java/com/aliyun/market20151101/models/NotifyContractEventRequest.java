// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class NotifyContractEventRequest extends TeaModel {
    @NameInMap("EventMessage")
    public String eventMessage;

    @NameInMap("EventType")
    public String eventType;

    public static NotifyContractEventRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyContractEventRequest self = new NotifyContractEventRequest();
        return TeaModel.build(map, self);
    }

    public NotifyContractEventRequest setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
        return this;
    }
    public String getEventMessage() {
        return this.eventMessage;
    }

    public NotifyContractEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

}
