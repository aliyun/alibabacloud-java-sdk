// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CloseEventRequest extends TeaModel {
    @NameInMap("EventName")
    public String eventName;

    @NameInMap("EventObjectId")
    public String eventObjectId;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CloseEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseEventRequest self = new CloseEventRequest();
        return TeaModel.build(map, self);
    }

    public CloseEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CloseEventRequest setEventObjectId(String eventObjectId) {
        this.eventObjectId = eventObjectId;
        return this;
    }
    public String getEventObjectId() {
        return this.eventObjectId;
    }

    public CloseEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public CloseEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
