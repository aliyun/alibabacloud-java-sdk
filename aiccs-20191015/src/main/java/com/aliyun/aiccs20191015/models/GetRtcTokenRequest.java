// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRtcTokenRequest extends TeaModel {
    // 账号名称
    @NameInMap("AccountName")
    public String accountName;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRtcTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRtcTokenRequest self = new GetRtcTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetRtcTokenRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetRtcTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
