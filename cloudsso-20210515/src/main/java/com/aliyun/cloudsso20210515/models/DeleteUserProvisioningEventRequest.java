// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningEventRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the RAM user provisioning event.</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The ID of the RAM user provisioning.</p>
     */
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
