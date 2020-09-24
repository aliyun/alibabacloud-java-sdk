// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindAllServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindAllServiceResponseBody body;

    public static FindAllServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        FindAllServiceResponse self = new FindAllServiceResponse();
        return TeaModel.build(map, self);
    }

    public FindAllServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindAllServiceResponse setBody(FindAllServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public FindAllServiceResponseBody getBody() {
        return this.body;
    }

}
