// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetZeroCreditShutdownStatusRequest extends TeaModel {
    @NameInMap("ShutdownPolicy")
    public String shutdownPolicy;

    @NameInMap("Uid")
    public Long uid;

    public static SetZeroCreditShutdownStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetZeroCreditShutdownStatusRequest self = new SetZeroCreditShutdownStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetZeroCreditShutdownStatusRequest setShutdownPolicy(String shutdownPolicy) {
        this.shutdownPolicy = shutdownPolicy;
        return this;
    }
    public String getShutdownPolicy() {
        return this.shutdownPolicy;
    }

    public SetZeroCreditShutdownStatusRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
