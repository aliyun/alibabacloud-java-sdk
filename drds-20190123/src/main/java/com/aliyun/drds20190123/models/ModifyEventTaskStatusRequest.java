// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyEventTaskStatusRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Region")
    public String region;

    @NameInMap("SwitchTime")
    public Long switchTime;

    public static ModifyEventTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventTaskStatusRequest self = new ModifyEventTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventTaskStatusRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ModifyEventTaskStatusRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyEventTaskStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyEventTaskStatusRequest setSwitchTime(Long switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public Long getSwitchTime() {
        return this.switchTime;
    }

}
