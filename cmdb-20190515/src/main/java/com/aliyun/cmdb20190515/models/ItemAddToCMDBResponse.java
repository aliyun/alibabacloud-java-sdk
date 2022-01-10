// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemAddToCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ItemAddToCMDBResponseBody body;

    public static ItemAddToCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ItemAddToCMDBResponse self = new ItemAddToCMDBResponse();
        return TeaModel.build(map, self);
    }

    public ItemAddToCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ItemAddToCMDBResponse setBody(ItemAddToCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ItemAddToCMDBResponseBody getBody() {
        return this.body;
    }

}
