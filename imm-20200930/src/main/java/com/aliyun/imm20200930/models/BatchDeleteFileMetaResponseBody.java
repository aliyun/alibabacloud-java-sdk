// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchDeleteFileMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3A82F6C9-5AC0-38F9-914F-F02623B3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteFileMetaResponseBody self = new BatchDeleteFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
