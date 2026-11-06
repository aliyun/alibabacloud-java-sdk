// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionEventsResponseBody extends TeaModel {
    /**
     * <p>The event data of the current frame. The content varies with the Event type and should be parsed according to the event type. Preserve the original session, turn, and tool invocation identifiers.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The SSE event type, such as session_update. Process control frames and business frames separately.</p>
     * 
     * <strong>example:</strong>
     * <p>session_update</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The remote SSE event cursor. Save it after consumption for subsequent resumption using Last-Event-Id. Some control frames may not have a cursor. Do not generate a local cursor for them.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID of the current OpenAPI subscription request, used to troubleshoot subscription failures. It is not an event cursor or an interactive question ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0B6E0-E005-1465-B5DE-5CD17677426F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentSessionEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionEventsResponseBody self = new GetAgentSessionEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionEventsResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetAgentSessionEventsResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public GetAgentSessionEventsResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAgentSessionEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
