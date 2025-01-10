// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetDestinationCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDestinationCidrBlockResponseBody body;

    public static GetDestinationCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDestinationCidrBlockResponse self = new GetDestinationCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public GetDestinationCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDestinationCidrBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDestinationCidrBlockResponse setBody(GetDestinationCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDestinationCidrBlockResponseBody getBody() {
        return this.body;
    }

}
