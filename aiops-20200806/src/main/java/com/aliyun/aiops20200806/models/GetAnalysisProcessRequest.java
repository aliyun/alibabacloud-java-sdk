// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAnalysisProcessRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAnalysisProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAnalysisProcessRequest self = new GetAnalysisProcessRequest();
        return TeaModel.build(map, self);
    }

    public GetAnalysisProcessRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetAnalysisProcessRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAnalysisProcessRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
