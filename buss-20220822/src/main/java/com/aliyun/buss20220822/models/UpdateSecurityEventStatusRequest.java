// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class UpdateSecurityEventStatusRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Status")
    public String status;

    @NameInMap("callerParentId")
    public Long callerParentId;

    @NameInMap("callerType")
    public String callerType;

    @NameInMap("callerUid")
    public Long callerUid;

    public static UpdateSecurityEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityEventStatusRequest self = new UpdateSecurityEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityEventStatusRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public UpdateSecurityEventStatusRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public UpdateSecurityEventStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateSecurityEventStatusRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public UpdateSecurityEventStatusRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public UpdateSecurityEventStatusRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

}
