// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class LockStatus extends TeaModel {
    @NameInMap("LockId")
    public Long lockId;

    @NameInMap("LockState")
    public String lockState;

    public static LockStatus build(java.util.Map<String, ?> map) throws Exception {
        LockStatus self = new LockStatus();
        return TeaModel.build(map, self);
    }

    public LockStatus setLockId(Long lockId) {
        this.lockId = lockId;
        return this;
    }
    public Long getLockId() {
        return this.lockId;
    }

    public LockStatus setLockState(String lockState) {
        this.lockState = lockState;
        return this;
    }
    public String getLockState() {
        return this.lockState;
    }

}
