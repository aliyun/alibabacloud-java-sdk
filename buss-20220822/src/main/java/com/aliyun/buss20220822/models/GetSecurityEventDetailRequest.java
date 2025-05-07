// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class GetSecurityEventDetailRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("callerParentId")
    public Long callerParentId;

    @NameInMap("callerType")
    public String callerType;

    @NameInMap("callerUid")
    public Long callerUid;

    public static GetSecurityEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityEventDetailRequest self = new GetSecurityEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSecurityEventDetailRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetSecurityEventDetailRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetSecurityEventDetailRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public GetSecurityEventDetailRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public GetSecurityEventDetailRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

}
