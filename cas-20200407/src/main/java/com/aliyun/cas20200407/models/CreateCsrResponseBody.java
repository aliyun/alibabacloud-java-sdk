// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCsrResponseBody extends TeaModel {
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>CSR ID。</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCsrResponseBody self = new CreateCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCsrResponseBody setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateCsrResponseBody setCsrId(Long csrId) {
        this.csrId = csrId;
        return this;
    }
    public Long getCsrId() {
        return this.csrId;
    }

    public CreateCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
