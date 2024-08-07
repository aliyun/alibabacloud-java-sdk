// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateSignatureResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the back-end signature key.</p>
     * 
     * <strong>example:</strong>
     * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>The name of the back-end signature key.</p>
     * 
     * <strong>example:</strong>
     * <p>backendsignature</p>
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
