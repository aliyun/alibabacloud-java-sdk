// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricAlertListRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessMetricAlertListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricAlertListRequest self = new GetBusinessMetricAlertListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricAlertListRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetBusinessMetricAlertListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
