// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolSyncJobRequest extends TeaModel {
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetUserPoolSyncJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserPoolSyncJobRequest self = new GetUserPoolSyncJobRequest();
        return TeaModel.build(map, self);
    }

    public GetUserPoolSyncJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public GetUserPoolSyncJobRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
