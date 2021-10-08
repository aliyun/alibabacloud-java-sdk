// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventRootCauseRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("EventId")
    public String eventId;

    public static GetEventRootCauseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventRootCauseRequest self = new GetEventRootCauseRequest();
        return TeaModel.build(map, self);
    }

    public GetEventRootCauseRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetEventRootCauseRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
