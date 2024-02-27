// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCsrDetailResponseBody extends TeaModel {
    @NameInMap("Csr")
    public String csr;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCsrDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCsrDetailResponseBody self = new GetCsrDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCsrDetailResponseBody setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public GetCsrDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
