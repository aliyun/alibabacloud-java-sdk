// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class VerifyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignatureValid")
    public Boolean signatureValid;

    public static VerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyResponseBody self = new VerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyResponseBody setSignatureValid(Boolean signatureValid) {
        this.signatureValid = signatureValid;
        return this;
    }
    public Boolean getSignatureValid() {
        return this.signatureValid;
    }

}
