// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UnLockRequest extends TeaModel {
    /**
     * <p>LockId</p>
     * 
     * <strong>example:</strong>
     * <p>11709</p>
     */
    @NameInMap("LockId")
    public Long lockId;

    public static UnLockRequest build(java.util.Map<String, ?> map) throws Exception {
        UnLockRequest self = new UnLockRequest();
        return TeaModel.build(map, self);
    }

    public UnLockRequest setLockId(Long lockId) {
        this.lockId = lockId;
        return this;
    }
    public Long getLockId() {
        return this.lockId;
    }

}
