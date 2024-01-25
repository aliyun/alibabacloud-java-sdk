// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunAnalysisProcessRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static RunAnalysisProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAnalysisProcessRequest self = new RunAnalysisProcessRequest();
        return TeaModel.build(map, self);
    }

    public RunAnalysisProcessRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public RunAnalysisProcessRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
