// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationObjectModifyStatusRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static DescribeSynchronizationObjectModifyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationObjectModifyStatusRequest self = new DescribeSynchronizationObjectModifyStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationObjectModifyStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeSynchronizationObjectModifyStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSynchronizationObjectModifyStatusRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSynchronizationObjectModifyStatusRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
