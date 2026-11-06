// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionEventsRequest extends TeaModel {
    /**
     * <p>The epoch identifier of the event stream, obtained from data.eventEpoch in the stream_open control frame of the server. Pass the original value only when Last-Event-Id of the same native session and the same epoch is provided. Omit this parameter when subscribing for the first time or when the epoch is not obtained. Do not construct it yourself or reuse it across native sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>epoch_example</p>
     */
    @NameInMap("EventEpoch")
    public String eventEpoch;

    /**
     * <p>The ID of the target agent session. Set the value to the SessionId returned by CreateAgentSession. The parameter name for this API operation is SessionCode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>session_example</p>
     */
    @NameInMap("SessionCode")
    public String sessionCode;

    public static GetAgentSessionEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionEventsRequest self = new GetAgentSessionEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionEventsRequest setEventEpoch(String eventEpoch) {
        this.eventEpoch = eventEpoch;
        return this;
    }
    public String getEventEpoch() {
        return this.eventEpoch;
    }

    public GetAgentSessionEventsRequest setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
        return this;
    }
    public String getSessionCode() {
        return this.sessionCode;
    }

}
