// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineRuntimeInfoRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 账号名
    @NameInMap("AccountName")
    public String accountName;

    public static GetHotlineRuntimeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineRuntimeInfoRequest self = new GetHotlineRuntimeInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineRuntimeInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHotlineRuntimeInfoRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
