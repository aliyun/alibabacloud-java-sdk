// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCsrDetailResponseBody extends TeaModel {
    /**
     * <p>The content of the CSR.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----   ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The private key. Specify a Base64-encoded string.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY-----…… -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>08F45EA0-66A7-4504-9B31-3589F5CE308D</p>
     */
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

    public GetCsrDetailResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public GetCsrDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
