// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDatasetResponseBody extends TeaModel {
    @NameInMap("Dataset")
    public Dataset dataset;

    /**
     * <strong>example:</strong>
     * <p>6D74B3A9-5AC0-49F9-914D-E01589D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetResponseBody self = new CreateDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetResponseBody setDataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }
    public Dataset getDataset() {
        return this.dataset;
    }

    public CreateDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
