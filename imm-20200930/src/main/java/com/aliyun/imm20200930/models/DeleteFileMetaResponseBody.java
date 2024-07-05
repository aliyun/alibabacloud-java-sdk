// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteFileMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7F82D6C9-5AC0-49F9-914D-F02678F3****</p>
     */
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
