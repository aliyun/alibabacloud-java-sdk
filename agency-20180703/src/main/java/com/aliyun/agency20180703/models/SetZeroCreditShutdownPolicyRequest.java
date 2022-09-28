// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetZeroCreditShutdownPolicyRequest extends TeaModel {
    @NameInMap("ShutdownPolicy")
    public String shutdownPolicy;

    @NameInMap("Uid")
    public Long uid;

    public static SetZeroCreditShutdownPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetZeroCreditShutdownPolicyRequest self = new SetZeroCreditShutdownPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetZeroCreditShutdownPolicyRequest setShutdownPolicy(String shutdownPolicy) {
        this.shutdownPolicy = shutdownPolicy;
        return this;
    }
    public String getShutdownPolicy() {
        return this.shutdownPolicy;
    }

    public SetZeroCreditShutdownPolicyRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
