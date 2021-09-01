// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListAllProfessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllProfessionResponseBody body;

    public static ListAllProfessionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllProfessionResponse self = new ListAllProfessionResponse();
        return TeaModel.build(map, self);
    }

    public ListAllProfessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllProfessionResponse setBody(ListAllProfessionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllProfessionResponseBody getBody() {
        return this.body;
    }

}
