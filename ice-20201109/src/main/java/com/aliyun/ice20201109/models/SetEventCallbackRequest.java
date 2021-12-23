// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetEventCallbackRequest extends TeaModel {
    @NameInMap("CallbackQueueName")
    public String callbackQueueName;

    @NameInMap("EventTypeList")
    public String eventTypeList;

    @NameInMap("RegionId")
    public String regionId;

    public static SetEventCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEventCallbackRequest self = new SetEventCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SetEventCallbackRequest setCallbackQueueName(String callbackQueueName) {
        this.callbackQueueName = callbackQueueName;
        return this;
    }
    public String getCallbackQueueName() {
        return this.callbackQueueName;
    }

    public SetEventCallbackRequest setEventTypeList(String eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }
    public String getEventTypeList() {
        return this.eventTypeList;
    }

    public SetEventCallbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
