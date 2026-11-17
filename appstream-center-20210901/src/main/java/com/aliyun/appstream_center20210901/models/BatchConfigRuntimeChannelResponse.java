// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BatchConfigRuntimeChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchConfigRuntimeChannelResponseBody body;

    public static BatchConfigRuntimeChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchConfigRuntimeChannelResponse self = new BatchConfigRuntimeChannelResponse();
        return TeaModel.build(map, self);
    }

    public BatchConfigRuntimeChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchConfigRuntimeChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchConfigRuntimeChannelResponse setBody(BatchConfigRuntimeChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchConfigRuntimeChannelResponseBody getBody() {
        return this.body;
    }

}
