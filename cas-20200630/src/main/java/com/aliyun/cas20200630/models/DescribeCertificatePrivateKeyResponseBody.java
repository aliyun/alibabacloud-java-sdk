// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCertificatePrivateKeyResponseBody extends TeaModel {
    @NameInMap("EncryptedData")
    public String encryptedData;

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
