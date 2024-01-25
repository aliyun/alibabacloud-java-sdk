// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessLogAlertListRequest extends TeaModel {
    @NameInMap("EventId")
    public Long eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessLogAlertListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessLogAlertListRequest self = new GetBusinessLogAlertListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessLogAlertListRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public GetBusinessLogAlertListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
