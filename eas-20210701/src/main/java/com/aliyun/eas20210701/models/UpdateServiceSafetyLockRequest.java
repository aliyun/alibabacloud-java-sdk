// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceSafetyLockRequest extends TeaModel {
    /**
     * <p>The lock scope. Valid values:</p>
     * <br>
     * <p>*   all: locks all operations.</p>
     * <p>*   dangerous: locks high-risk operations such as delete and stop operations.</p>
     * <p>*   none: locks no operations.</p>
     * <br>
     * <p>Enumerated values:</p>
     * <br>
     * <p>*   all</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   dangerous</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   none</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
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
