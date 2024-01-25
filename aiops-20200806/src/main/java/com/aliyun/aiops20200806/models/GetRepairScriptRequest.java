// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRepairScriptRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetRepairScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepairScriptRequest self = new GetRepairScriptRequest();
        return TeaModel.build(map, self);
    }

    public GetRepairScriptRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetRepairScriptRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
