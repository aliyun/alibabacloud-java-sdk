// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableListByCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaTableListByCategoryResponseBody body;

    public static GetMetaTableListByCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableListByCategoryResponse self = new GetMetaTableListByCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableListByCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableListByCategoryResponse setBody(GetMetaTableListByCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableListByCategoryResponseBody getBody() {
        return this.body;
    }

}
