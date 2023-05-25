// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifySignatureResponseBody extends TeaModel {
    /**
     * <p>The name of the key.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   This API operation modifies the name, Key value, and Secret value of an existing signature key.</p>
     * <p>*   Note that the modification takes effect immediately. If the key has been bound to an API, you must adjust the backend signature verification based on the new key accordingly.</p>
     * <p>*   The QPS limit on this operation is 50 per user.</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>Modifies a backend signature key.</p>
     */
    @NameInMap("SignatureName")
    public String signatureName;

    public static ModifySignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySignatureResponseBody self = new ModifySignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySignatureResponseBody setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public ModifySignatureResponseBody setSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }
    public String getSignatureName() {
        return this.signatureName;
    }

}
