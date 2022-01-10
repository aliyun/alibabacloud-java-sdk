// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetLabelsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasetLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetLabelsResponseBody self = new DeleteDatasetLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
