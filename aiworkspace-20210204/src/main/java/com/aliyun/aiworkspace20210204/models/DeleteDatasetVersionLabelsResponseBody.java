// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetVersionLabelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasetVersionLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetVersionLabelsResponseBody self = new DeleteDatasetVersionLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetVersionLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
