// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningEventRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EventId")
    public String eventId;

    public static GetUserProvisioningEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningEventRequest self = new GetUserProvisioningEventRequest();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningEventRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetUserProvisioningEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
