// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetResponseBody extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetResponseBody self = new CreateDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
