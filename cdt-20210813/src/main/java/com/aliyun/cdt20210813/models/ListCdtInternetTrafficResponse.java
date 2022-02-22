// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtInternetTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCdtInternetTrafficResponseBody body;

    public static ListCdtInternetTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCdtInternetTrafficResponse self = new ListCdtInternetTrafficResponse();
        return TeaModel.build(map, self);
    }

    public ListCdtInternetTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCdtInternetTrafficResponse setBody(ListCdtInternetTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCdtInternetTrafficResponseBody getBody() {
        return this.body;
    }

}
