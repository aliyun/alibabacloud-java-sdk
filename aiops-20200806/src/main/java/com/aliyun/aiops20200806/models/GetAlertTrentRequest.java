// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertTrentRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAlertTrentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertTrentRequest self = new GetAlertTrentRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertTrentRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetAlertTrentRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetAlertTrentRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
