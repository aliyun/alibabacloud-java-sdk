// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateShopResponseBody body;

    public static BatchCreateShopResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopResponse self = new BatchCreateShopResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateShopResponse setBody(BatchCreateShopResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateShopResponseBody getBody() {
        return this.body;
    }

}
