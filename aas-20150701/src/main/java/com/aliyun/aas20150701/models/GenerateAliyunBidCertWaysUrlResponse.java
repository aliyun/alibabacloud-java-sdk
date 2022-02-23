// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GenerateAliyunBidCertWaysUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateAliyunBidCertWaysUrlResponseBody body;

    public static GenerateAliyunBidCertWaysUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAliyunBidCertWaysUrlResponse self = new GenerateAliyunBidCertWaysUrlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAliyunBidCertWaysUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAliyunBidCertWaysUrlResponse setBody(GenerateAliyunBidCertWaysUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAliyunBidCertWaysUrlResponseBody getBody() {
        return this.body;
    }

}
