// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DecryptResponseBody extends TeaModel {
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("Plaintext")
    public String plaintext;

    @NameInMap("RequestId")
    public String requestId;

    public static DecryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecryptResponseBody self = new DecryptResponseBody();
        return TeaModel.build(map, self);
    }

    public DecryptResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DecryptResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public DecryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
