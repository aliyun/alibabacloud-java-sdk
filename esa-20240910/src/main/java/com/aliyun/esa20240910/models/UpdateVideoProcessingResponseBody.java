// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateVideoProcessingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3558df77-8a7a-4060-a900-2d7949403836</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVideoProcessingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoProcessingResponseBody self = new UpdateVideoProcessingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVideoProcessingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
