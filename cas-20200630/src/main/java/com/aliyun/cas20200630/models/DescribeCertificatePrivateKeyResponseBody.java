// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCertificatePrivateKeyResponseBody extends TeaModel {
    /**
     * <p>The content of the encrypted private key.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN ENCRYPTED PRIVATE KEY----- …… -----END ENCRYPTED PRIVATE KEY-----</p>
     */
    @NameInMap("EncryptedData")
    public String encryptedData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>09470F19-CEE8-5C63-BF2C-02B5E3F07A17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCertificatePrivateKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificatePrivateKeyResponseBody self = new DescribeCertificatePrivateKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertificatePrivateKeyResponseBody setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
        return this;
    }
    public String getEncryptedData() {
        return this.encryptedData;
    }

    public DescribeCertificatePrivateKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
