// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class AbortLockRequest extends TeaModel {
    /**
     * <p>LockId</p>
     * 
     * <strong>example:</strong>
     * <p>16530</p>
     */
    @NameInMap("LockId")
    public Long lockId;

    public static AbortLockRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortLockRequest self = new AbortLockRequest();
        return TeaModel.build(map, self);
    }

    public AbortLockRequest setLockId(Long lockId) {
        this.lockId = lockId;
        return this;
    }
    public Long getLockId() {
        return this.lockId;
    }

}
