// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteDatasetVersionResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D17DE39E-6C62-50E3-9EB7-FDE41BB0D43D</p>
     */
    @NameInMap("requestId")
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
