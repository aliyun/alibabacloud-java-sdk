// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDbfsResponseBody self = new DeleteDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
