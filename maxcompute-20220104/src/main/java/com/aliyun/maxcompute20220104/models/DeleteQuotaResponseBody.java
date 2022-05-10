// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteQuotaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaResponseBody self = new DeleteQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
