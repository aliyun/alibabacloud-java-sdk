// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateEventDefinitionResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateEventDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventDefinitionResponseBody self = new CreateEventDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventDefinitionResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateEventDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
