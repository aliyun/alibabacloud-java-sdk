// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class TriggerDataLoaderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerDataLoaderResponseBody body;

    public static TriggerDataLoaderResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerDataLoaderResponse self = new TriggerDataLoaderResponse();
        return TeaModel.build(map, self);
    }

    public TriggerDataLoaderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerDataLoaderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerDataLoaderResponse setBody(TriggerDataLoaderResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerDataLoaderResponseBody getBody() {
        return this.body;
    }

}
