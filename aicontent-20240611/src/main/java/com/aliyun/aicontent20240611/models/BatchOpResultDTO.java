// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BatchOpResultDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("failed")
    public java.util.List<BatchFailedItemDTO> failed;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("succeeded")
    public java.util.List<Long> succeeded;

    public static BatchOpResultDTO build(java.util.Map<String, ?> map) throws Exception {
        BatchOpResultDTO self = new BatchOpResultDTO();
        return TeaModel.build(map, self);
    }

    public BatchOpResultDTO setFailed(java.util.List<BatchFailedItemDTO> failed) {
        this.failed = failed;
        return this;
    }
    public java.util.List<BatchFailedItemDTO> getFailed() {
        return this.failed;
    }

    public BatchOpResultDTO setSucceeded(java.util.List<Long> succeeded) {
        this.succeeded = succeeded;
        return this;
    }
    public java.util.List<Long> getSucceeded() {
        return this.succeeded;
    }

}
