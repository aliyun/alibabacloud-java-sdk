// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteTagsBatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTagsBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagsBatchResponseBody self = new DeleteTagsBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTagsBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
