// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RetryUserProvisioningEventRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("DuplicationStrategy")
    public String duplicationStrategy;

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
