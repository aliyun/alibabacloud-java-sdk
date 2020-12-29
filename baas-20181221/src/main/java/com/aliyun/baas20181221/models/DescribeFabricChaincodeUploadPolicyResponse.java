// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricChaincodeUploadPolicyResponseBody body;

    public static DescribeFabricChaincodeUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeUploadPolicyResponse self = new DescribeFabricChaincodeUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricChaincodeUploadPolicyResponse setBody(DescribeFabricChaincodeUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricChaincodeUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
