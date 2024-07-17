// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLockRequest extends TeaModel {
    /**
     * <p>LockId</p>
     * 
     * <strong>example:</strong>
     * <p>16533</p>
     */
    @NameInMap("LockId")
    public Long lockId;

    public static GetLockRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLockRequest self = new GetLockRequest();
        return TeaModel.build(map, self);
    }

    public GetLockRequest setLockId(Long lockId) {
        this.lockId = lockId;
        return this;
    }
    public Long getLockId() {
        return this.lockId;
    }

}
