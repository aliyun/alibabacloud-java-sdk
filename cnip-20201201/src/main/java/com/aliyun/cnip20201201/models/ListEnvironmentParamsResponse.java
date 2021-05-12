// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentParamsResponseBody body;

    public static ListEnvironmentParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentParamsResponse self = new ListEnvironmentParamsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentParamsResponse setBody(ListEnvironmentParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentParamsResponseBody getBody() {
        return this.body;
    }

}
