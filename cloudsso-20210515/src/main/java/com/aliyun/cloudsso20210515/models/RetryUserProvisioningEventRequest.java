// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RetryUserProvisioningEventRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
     * <br>
     * <p>*   KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix `_sso`.</p>
     * <p>*   TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</p>
     */
    @NameInMap("DuplicationStrategy")
    public String duplicationStrategy;

    /**
     * <p>The ID of the RAM user provisioning event.</p>
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
