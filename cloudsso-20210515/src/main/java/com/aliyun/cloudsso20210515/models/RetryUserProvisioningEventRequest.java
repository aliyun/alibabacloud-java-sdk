// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RetryUserProvisioningEventRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
     * <ul>
     * <li>KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix <code>_sso</code>.</li>
     * <li>TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeepBoth</p>
     */
    @NameInMap("DuplicationStrategy")
    public String duplicationStrategy;

    /**
     * <p>The ID of the RAM user provisioning event.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2636305.html">ListUserProvisioningEvents</a> operation to query the value of <code>EventId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>upe-wjKyNDmZvyZOiRcJ****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    public static RetryUserProvisioningEventRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryUserProvisioningEventRequest self = new RetryUserProvisioningEventRequest();
        return TeaModel.build(map, self);
    }

    public RetryUserProvisioningEventRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public RetryUserProvisioningEventRequest setDuplicationStrategy(String duplicationStrategy) {
        this.duplicationStrategy = duplicationStrategy;
        return this;
    }
    public String getDuplicationStrategy() {
        return this.duplicationStrategy;
    }

    public RetryUserProvisioningEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
