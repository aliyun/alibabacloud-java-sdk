// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeEndorsePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricChaincodeEndorsePolicyResponseBody body;

    public static DescribeFabricChaincodeEndorsePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeEndorsePolicyResponse self = new DescribeFabricChaincodeEndorsePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeEndorsePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricChaincodeEndorsePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricChaincodeEndorsePolicyResponse setBody(DescribeFabricChaincodeEndorsePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricChaincodeEndorsePolicyResponseBody getBody() {
        return this.body;
    }

}
