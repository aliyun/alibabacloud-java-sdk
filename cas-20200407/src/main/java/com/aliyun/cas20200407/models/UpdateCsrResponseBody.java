// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCsrResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCsrResponseBody self = new UpdateCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
