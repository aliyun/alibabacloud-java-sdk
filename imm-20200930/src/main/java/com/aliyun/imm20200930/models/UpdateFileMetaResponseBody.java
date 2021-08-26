// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFileMetaResponseBody extends TeaModel {
    // Id of the request
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
