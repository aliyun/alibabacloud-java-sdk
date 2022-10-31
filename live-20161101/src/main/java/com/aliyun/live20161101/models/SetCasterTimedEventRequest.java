// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterTimedEventRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTimeUTC")
    public String startTimeUTC;

    public static SetCasterTimedEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterTimedEventRequest self = new SetCasterTimedEventRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterTimedEventRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterTimedEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public SetCasterTimedEventRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCasterTimedEventRequest setStartTimeUTC(String startTimeUTC) {
        this.startTimeUTC = startTimeUTC;
        return this;
    }
    public String getStartTimeUTC() {
        return this.startTimeUTC;
    }

}
