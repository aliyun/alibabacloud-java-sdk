// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConvertableEcuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConvertableEcuResponseBody body;

    public static ListConvertableEcuResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConvertableEcuResponse self = new ListConvertableEcuResponse();
        return TeaModel.build(map, self);
    }

    public ListConvertableEcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConvertableEcuResponse setBody(ListConvertableEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConvertableEcuResponseBody getBody() {
        return this.body;
    }

}
