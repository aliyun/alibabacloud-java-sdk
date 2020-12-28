// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSoftwaresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSoftwaresResponseBody body;

    public static ListSoftwaresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwaresResponse self = new ListSoftwaresResponse();
        return TeaModel.build(map, self);
    }

    public ListSoftwaresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSoftwaresResponse setBody(ListSoftwaresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSoftwaresResponseBody getBody() {
        return this.body;
    }

}
