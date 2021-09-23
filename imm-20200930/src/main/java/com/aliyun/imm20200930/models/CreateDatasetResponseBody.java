// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDatasetResponseBody extends TeaModel {
    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Dataset")
    public Dataset dataset;

    public static CreateDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetResponseBody self = new CreateDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDatasetResponseBody setDataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }
    public Dataset getDataset() {
        return this.dataset;
    }

}
