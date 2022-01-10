// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemBatchUpdateFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ItemBatchUpdateFromCMDBResponseBody body;

    public static ItemBatchUpdateFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ItemBatchUpdateFromCMDBResponse self = new ItemBatchUpdateFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public ItemBatchUpdateFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ItemBatchUpdateFromCMDBResponse setBody(ItemBatchUpdateFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ItemBatchUpdateFromCMDBResponseBody getBody() {
        return this.body;
    }

}
