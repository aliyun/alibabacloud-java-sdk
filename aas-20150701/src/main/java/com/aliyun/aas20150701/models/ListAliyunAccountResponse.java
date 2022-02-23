// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class ListAliyunAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAliyunAccountResponseBody body;

    public static ListAliyunAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliyunAccountResponse self = new ListAliyunAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListAliyunAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAliyunAccountResponse setBody(ListAliyunAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAliyunAccountResponseBody getBody() {
        return this.body;
    }

}
