// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetJobConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DA869D1B-035A-43B2-ACC1-C56681BD9FAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasetJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetJobConfigResponseBody self = new DeleteDatasetJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
