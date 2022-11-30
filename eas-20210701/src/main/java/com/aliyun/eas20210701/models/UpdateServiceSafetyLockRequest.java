// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceSafetyLockRequest extends TeaModel {
    @NameInMap("Lock")
    public String lock;

    public static UpdateServiceSafetyLockRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSafetyLockRequest self = new UpdateServiceSafetyLockRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSafetyLockRequest setLock(String lock) {
        this.lock = lock;
        return this;
    }
    public String getLock() {
        return this.lock;
    }

}
