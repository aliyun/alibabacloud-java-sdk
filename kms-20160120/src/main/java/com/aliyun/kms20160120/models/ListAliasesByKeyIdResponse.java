// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesByKeyIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAliasesByKeyIdResponseBody body;

    public static ListAliasesByKeyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesByKeyIdResponse self = new ListAliasesByKeyIdResponse();
        return TeaModel.build(map, self);
    }

    public ListAliasesByKeyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAliasesByKeyIdResponse setBody(ListAliasesByKeyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAliasesByKeyIdResponseBody getBody() {
        return this.body;
    }

}
