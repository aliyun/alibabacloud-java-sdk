// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventDetailRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventDetailRequest self = new GetEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetEventDetailRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetEventDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetEventDetailRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
