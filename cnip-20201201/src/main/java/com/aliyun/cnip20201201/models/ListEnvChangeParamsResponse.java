// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvChangeParamsResponseBody body;

    public static ListEnvChangeParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeParamsResponse self = new ListEnvChangeParamsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvChangeParamsResponse setBody(ListEnvChangeParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvChangeParamsResponseBody getBody() {
        return this.body;
    }

}
