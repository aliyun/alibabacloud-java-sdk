// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class DeployLdpsSemiManagedComponentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeployLdpsSemiManagedComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployLdpsSemiManagedComponentResponseBody self = new DeployLdpsSemiManagedComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployLdpsSemiManagedComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
