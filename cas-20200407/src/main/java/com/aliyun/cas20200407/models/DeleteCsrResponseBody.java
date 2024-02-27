// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCsrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCsrResponseBody self = new DeleteCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
