// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceResponseBody body;

    public static ListServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceResponse self = new ListServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceResponse setBody(ListServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceResponseBody getBody() {
        return this.body;
    }

}
