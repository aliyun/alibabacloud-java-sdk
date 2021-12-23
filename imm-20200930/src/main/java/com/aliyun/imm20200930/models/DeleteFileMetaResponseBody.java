// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteFileMetaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileMetaResponseBody self = new DeleteFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
