// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetForecastBusinessMetricRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetForecastBusinessMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetForecastBusinessMetricRequest self = new GetForecastBusinessMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetForecastBusinessMetricRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetForecastBusinessMetricRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
