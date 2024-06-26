// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChaincodeUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChaincodeUploadPolicyResponseBody body;

    public static DescribeChaincodeUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChaincodeUploadPolicyResponse self = new DescribeChaincodeUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChaincodeUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChaincodeUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChaincodeUploadPolicyResponse setBody(DescribeChaincodeUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChaincodeUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
