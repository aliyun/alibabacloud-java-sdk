// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemUpdateFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ItemUpdateFromCMDBResponseBody body;

    public static ItemUpdateFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ItemUpdateFromCMDBResponse self = new ItemUpdateFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public ItemUpdateFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ItemUpdateFromCMDBResponse setBody(ItemUpdateFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ItemUpdateFromCMDBResponseBody getBody() {
        return this.body;
    }

}
