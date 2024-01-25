// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunForecastAnalyzeRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static RunForecastAnalyzeRequest build(java.util.Map<String, ?> map) throws Exception {
        RunForecastAnalyzeRequest self = new RunForecastAnalyzeRequest();
        return TeaModel.build(map, self);
    }

    public RunForecastAnalyzeRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public RunForecastAnalyzeRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
