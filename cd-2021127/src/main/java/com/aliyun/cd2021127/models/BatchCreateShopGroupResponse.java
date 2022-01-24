// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateShopGroupResponseBody body;

    public static BatchCreateShopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopGroupResponse self = new BatchCreateShopGroupResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateShopGroupResponse setBody(BatchCreateShopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateShopGroupResponseBody getBody() {
        return this.body;
    }

}
