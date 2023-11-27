// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningEventRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("UserProvisioningId")
    public String userProvisioningId;

    public static DeleteUserProvisioningEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserProvisioningEventRequest self = new DeleteUserProvisioningEventRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserProvisioningEventRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DeleteUserProvisioningEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DeleteUserProvisioningEventRequest setUserProvisioningId(String userProvisioningId) {
        this.userProvisioningId = userProvisioningId;
        return this;
    }
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

}
