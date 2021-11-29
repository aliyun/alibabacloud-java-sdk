// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListFCTriggerRequest extends TeaModel {
    @NameInMap("EventMetaName")
    public String eventMetaName;

    @NameInMap("EventMetaVersion")
    public String eventMetaVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ListFCTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFCTriggerRequest self = new ListFCTriggerRequest();
        return TeaModel.build(map, self);
    }

    public ListFCTriggerRequest setEventMetaName(String eventMetaName) {
        this.eventMetaName = eventMetaName;
        return this;
    }
    public String getEventMetaName() {
        return this.eventMetaName;
    }

    public ListFCTriggerRequest setEventMetaVersion(String eventMetaVersion) {
        this.eventMetaVersion = eventMetaVersion;
        return this;
    }
    public String getEventMetaVersion() {
        return this.eventMetaVersion;
    }

    public ListFCTriggerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
