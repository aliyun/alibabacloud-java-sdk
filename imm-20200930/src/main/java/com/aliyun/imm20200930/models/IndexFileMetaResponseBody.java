// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static IndexFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IndexFileMetaResponseBody self = new IndexFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public IndexFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
