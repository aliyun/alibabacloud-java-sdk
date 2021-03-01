// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertOrUpdateRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertOrUpdateRegionResponseBody body;

    public static InsertOrUpdateRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertOrUpdateRegionResponse self = new InsertOrUpdateRegionResponse();
        return TeaModel.build(map, self);
    }

    public InsertOrUpdateRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertOrUpdateRegionResponse setBody(InsertOrUpdateRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertOrUpdateRegionResponseBody getBody() {
        return this.body;
    }

}
