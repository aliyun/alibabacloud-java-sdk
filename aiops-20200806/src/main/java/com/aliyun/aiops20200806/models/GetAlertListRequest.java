// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertListRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAlertListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertListRequest self = new GetAlertListRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertListRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetAlertListRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetAlertListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
