// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnEsTemplateInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDcdnEsTemplateInfoResponseBody body;

    public static ListDcdnEsTemplateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnEsTemplateInfoResponse self = new ListDcdnEsTemplateInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListDcdnEsTemplateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDcdnEsTemplateInfoResponse setBody(ListDcdnEsTemplateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDcdnEsTemplateInfoResponseBody getBody() {
        return this.body;
    }

}
