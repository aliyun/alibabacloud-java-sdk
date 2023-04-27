// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeployPolicyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployPolicyInstanceResponseBody self = new DeployPolicyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployPolicyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
