// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionLabelsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8D7B2E70-F770-505B-A672-09F1D8F2EC1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetVersionLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionLabelsResponseBody self = new CreateDatasetVersionLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
