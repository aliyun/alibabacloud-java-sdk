// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class GetDIDResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;{\&quot;creator\&quot;:\&quot;did:mychain:xxx\&quot;,\&quot;created\&quot;:\&quot;2020-05-22T13:59:49+0800\&quot;,\&quot;service\&quot;:[],\&quot;index\&quot;:[],\&quot;id\&quot;:\&quot;did:mychain:xxx\&quot;,\&quot;publicKey\&quot;:[{\&quot;controller\&quot;:\&quot;did:mychain:xxx\&quot;,\&quot;id\&quot;:\&quot;keys-1\&quot;,\&quot;publicKey\&quot;:\&quot;xxx\&quot;,\&quot;type\&quot;:\&quot;Secp256k1VerificationKey2018\&quot;}],\&quot;type\&quot;:\&quot;Corporate\&quot;,\&quot;@context\&quot;:\&quot;<a href="https://w3id.org/did/v1%5C%5C%22,%5C%5C%22updated%5C%5C%22:%5C%5C%222020-05-22T13:59:49+0800%5C%5C%22,%5C%5C%22version%5C%5C%22:0,%5C%5C%22authentication%5C%5C%22:%5B%5C%5C%22keys-1%5C%5C%22%5D%7D">https://w3id.org/did/v1\\&quot;,\\&quot;updated\\&quot;:\\&quot;2020-05-22T13:59:49+0800\\&quot;,\\&quot;version\\&quot;:0,\\&quot;authentication\\&quot;:[\\&quot;keys-1\\&quot;]}</a>&quot;</p>
     */
    @NameInMap("Doc")
    public String doc;

    /**
     * <strong>example:</strong>
     * <p>&quot;2C93E421-AD9D-4ABE-B519-6E1ACD18934C&quot;</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>&quot;OK&quot;</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDIDResponseBody self = new GetDIDResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDIDResponseBody setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

    public GetDIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDIDResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDIDResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDIDResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
