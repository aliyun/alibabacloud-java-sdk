// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateDatasetResponseBody extends TeaModel {
    @NameInMap("Dataset")
    public Dataset dataset;

    /**
     * <strong>example:</strong>
     * <p>45234D4A-A3E3-4B23-AACA-8D897514****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetResponseBody self = new UpdateDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetResponseBody setDataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }
    public Dataset getDataset() {
        return this.dataset;
    }

    public UpdateDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
