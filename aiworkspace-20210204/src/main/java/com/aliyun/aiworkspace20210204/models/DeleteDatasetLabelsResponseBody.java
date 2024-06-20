// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetLabelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>64B50C1D-D4C2-560C-86A3-A6ED****16D</p>
     */
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
