// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtTrafficTiersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCdtTrafficTiersResponseBody body;

    public static ListCdtTrafficTiersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCdtTrafficTiersResponse self = new ListCdtTrafficTiersResponse();
        return TeaModel.build(map, self);
    }

    public ListCdtTrafficTiersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCdtTrafficTiersResponse setBody(ListCdtTrafficTiersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCdtTrafficTiersResponseBody getBody() {
        return this.body;
    }

}
