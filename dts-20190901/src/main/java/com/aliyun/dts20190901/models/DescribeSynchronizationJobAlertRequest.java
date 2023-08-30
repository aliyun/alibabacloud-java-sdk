// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobAlertRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static DescribeSynchronizationJobAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobAlertRequest self = new DescribeSynchronizationJobAlertRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobAlertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSynchronizationJobAlertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSynchronizationJobAlertRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeSynchronizationJobAlertRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
