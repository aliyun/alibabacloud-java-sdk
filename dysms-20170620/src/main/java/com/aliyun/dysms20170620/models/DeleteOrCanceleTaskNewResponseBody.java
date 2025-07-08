// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteOrCanceleTaskNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Long result;

    public static DeleteOrCanceleTaskNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrCanceleTaskNewResponseBody self = new DeleteOrCanceleTaskNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOrCanceleTaskNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteOrCanceleTaskNewResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
