// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventBusinessMetricListRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetEventBusinessMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventBusinessMetricListRequest self = new GetEventBusinessMetricListRequest();
        return TeaModel.build(map, self);
    }

    public GetEventBusinessMetricListRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetEventBusinessMetricListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
