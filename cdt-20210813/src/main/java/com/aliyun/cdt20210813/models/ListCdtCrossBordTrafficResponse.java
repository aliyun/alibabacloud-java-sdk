// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtCrossBordTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCdtCrossBordTrafficResponseBody body;

    public static ListCdtCrossBordTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCdtCrossBordTrafficResponse self = new ListCdtCrossBordTrafficResponse();
        return TeaModel.build(map, self);
    }

    public ListCdtCrossBordTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCdtCrossBordTrafficResponse setBody(ListCdtCrossBordTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCdtCrossBordTrafficResponseBody getBody() {
        return this.body;
    }

}
