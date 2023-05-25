// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateSignatureResponseBody extends TeaModel {
    /**
     * <p>The name of the back-end signature key.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   The API operation only creates a key policy. You must call the binding operation to bind the key to an API.</p>
     * <p>*   After the key is bound to the API, requests sent from API Gateway to the backend service contain signature strings. You can specify whether your backend service verifies these signature strings.</p>
     * <p>*   The QPS limit on this operation is 50 per user.</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>Creates a backend signature key.</p>
     */
    @NameInMap("SignatureName")
    public String signatureName;

    public static CreateSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureResponseBody self = new CreateSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSignatureResponseBody setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public CreateSignatureResponseBody setSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }
    public String getSignatureName() {
        return this.signatureName;
    }

}
