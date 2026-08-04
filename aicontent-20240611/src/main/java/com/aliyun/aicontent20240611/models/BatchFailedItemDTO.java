// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BatchFailedItemDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Member node is missing</p>
     */
    @NameInMap("reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static BatchFailedItemDTO build(java.util.Map<String, ?> map) throws Exception {
        BatchFailedItemDTO self = new BatchFailedItemDTO();
        return TeaModel.build(map, self);
    }

    public BatchFailedItemDTO setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public BatchFailedItemDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
