// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionLabelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
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
