// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCsrResponseBody extends TeaModel {
    /**
     * <p>The content of the CSR.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The unique identifier of the CSR. You can use this value to obtain the content of the CSR. For more information about the operation that you can call to obtain the content of a CSR, see <a href="https://help.aliyun.com/document_detail/2709720.html">GetCsrDetail</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>3365</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
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
