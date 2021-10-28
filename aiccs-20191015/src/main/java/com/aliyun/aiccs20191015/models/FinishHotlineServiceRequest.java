// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class FinishHotlineServiceRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    public static FinishHotlineServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishHotlineServiceRequest self = new FinishHotlineServiceRequest();
        return TeaModel.build(map, self);
    }

    public FinishHotlineServiceRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public FinishHotlineServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FinishHotlineServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
