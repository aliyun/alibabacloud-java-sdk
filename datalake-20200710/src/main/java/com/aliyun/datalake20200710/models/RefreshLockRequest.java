// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RefreshLockRequest extends TeaModel {
    /**
     * <p>LockId</p>
     * 
     * <strong>example:</strong>
     * <p>12324</p>
     */
    @NameInMap("LockId")
    public Long lockId;

    public static RefreshLockRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshLockRequest self = new RefreshLockRequest();
        return TeaModel.build(map, self);
    }

    public RefreshLockRequest setLockId(Long lockId) {
        this.lockId = lockId;
        return this;
    }
    public Long getLockId() {
        return this.lockId;
    }

}
