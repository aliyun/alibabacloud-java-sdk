// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditZeroCreditShutdownRequest extends TeaModel {
    @NameInMap("ShutdownPolicy")
    public String shutdownPolicy;

    /**
     * <p>uid</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static EditZeroCreditShutdownRequest build(java.util.Map<String, ?> map) throws Exception {
        EditZeroCreditShutdownRequest self = new EditZeroCreditShutdownRequest();
        return TeaModel.build(map, self);
    }

    public EditZeroCreditShutdownRequest setShutdownPolicy(String shutdownPolicy) {
        this.shutdownPolicy = shutdownPolicy;
        return this;
    }
    public String getShutdownPolicy() {
        return this.shutdownPolicy;
    }

    public EditZeroCreditShutdownRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
