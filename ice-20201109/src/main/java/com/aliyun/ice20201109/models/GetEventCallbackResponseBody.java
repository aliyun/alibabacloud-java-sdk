// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEventCallbackResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CallbackQueueName")
    public String callbackQueueName;

    @NameInMap("EventTypeList")
    public String eventTypeList;

    public static GetEventCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventCallbackResponseBody self = new GetEventCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventCallbackResponseBody setCallbackQueueName(String callbackQueueName) {
        this.callbackQueueName = callbackQueueName;
        return this;
    }
    public String getCallbackQueueName() {
        return this.callbackQueueName;
    }

    public GetEventCallbackResponseBody setEventTypeList(String eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }
    public String getEventTypeList() {
        return this.eventTypeList;
    }

}
