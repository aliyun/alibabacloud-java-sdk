// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class LockStatus extends TeaModel {
    // LockId
    @NameInMap("LockId")
    public Long lockId;

    // ACQUIRED/NOT_ACQUIRED
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
