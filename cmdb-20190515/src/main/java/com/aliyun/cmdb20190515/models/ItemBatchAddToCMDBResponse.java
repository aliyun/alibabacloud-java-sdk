// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemBatchAddToCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ItemBatchAddToCMDBResponseBody body;

    public static ItemBatchAddToCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ItemBatchAddToCMDBResponse self = new ItemBatchAddToCMDBResponse();
        return TeaModel.build(map, self);
    }

    public ItemBatchAddToCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ItemBatchAddToCMDBResponse setBody(ItemBatchAddToCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ItemBatchAddToCMDBResponseBody getBody() {
        return this.body;
    }

}
