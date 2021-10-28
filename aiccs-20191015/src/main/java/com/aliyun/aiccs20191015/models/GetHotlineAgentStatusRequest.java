// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentStatusRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetHotlineAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentStatusRequest self = new GetHotlineAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentStatusRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetHotlineAgentStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
