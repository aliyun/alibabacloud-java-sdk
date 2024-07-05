// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFileMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6D53E6C9-5AC0-48F9-825F-D02678E3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMetaResponseBody self = new UpdateFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
