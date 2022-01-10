// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetLabelsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetLabelsResponseBody self = new CreateDatasetLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
