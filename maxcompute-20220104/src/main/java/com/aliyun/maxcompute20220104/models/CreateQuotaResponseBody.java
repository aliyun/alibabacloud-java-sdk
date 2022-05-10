// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaResponseBody self = new CreateQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
