// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddAntChainSubnetNodeCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAntChainSubnetNodeCheckResponseBody body;

    public static AddAntChainSubnetNodeCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAntChainSubnetNodeCheckResponse self = new AddAntChainSubnetNodeCheckResponse();
        return TeaModel.build(map, self);
    }

    public AddAntChainSubnetNodeCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAntChainSubnetNodeCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAntChainSubnetNodeCheckResponse setBody(AddAntChainSubnetNodeCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAntChainSubnetNodeCheckResponseBody getBody() {
        return this.body;
    }

}
