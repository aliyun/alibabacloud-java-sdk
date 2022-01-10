// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemDeleteFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ItemDeleteFromCMDBResponseBody body;

    public static ItemDeleteFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ItemDeleteFromCMDBResponse self = new ItemDeleteFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public ItemDeleteFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ItemDeleteFromCMDBResponse setBody(ItemDeleteFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ItemDeleteFromCMDBResponseBody getBody() {
        return this.body;
    }

}
