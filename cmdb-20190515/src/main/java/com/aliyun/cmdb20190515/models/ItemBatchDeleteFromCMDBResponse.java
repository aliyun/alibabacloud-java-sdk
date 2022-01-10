// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemBatchDeleteFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ItemBatchDeleteFromCMDBResponseBody body;

    public static ItemBatchDeleteFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ItemBatchDeleteFromCMDBResponse self = new ItemBatchDeleteFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public ItemBatchDeleteFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ItemBatchDeleteFromCMDBResponse setBody(ItemBatchDeleteFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ItemBatchDeleteFromCMDBResponseBody getBody() {
        return this.body;
    }

}
