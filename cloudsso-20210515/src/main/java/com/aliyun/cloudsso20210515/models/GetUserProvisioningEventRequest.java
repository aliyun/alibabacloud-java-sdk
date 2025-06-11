// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningEventRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the RAM user provisioning event.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2636305.html">ListUserProvisioningEvents</a> operation to query the value of <code>EventId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>upe-wjKyNDmZvyZOiRcJ****</p>
     */
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
