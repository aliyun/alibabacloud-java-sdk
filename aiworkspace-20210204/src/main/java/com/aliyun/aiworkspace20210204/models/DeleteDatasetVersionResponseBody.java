// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasetVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetVersionResponseBody self = new DeleteDatasetVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
