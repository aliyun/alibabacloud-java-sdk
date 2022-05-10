// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PipelineFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PipelineFindAllResponseBody body;

    public static PipelineFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        PipelineFindAllResponse self = new PipelineFindAllResponse();
        return TeaModel.build(map, self);
    }

    public PipelineFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PipelineFindAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PipelineFindAllResponse setBody(PipelineFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public PipelineFindAllResponseBody getBody() {
        return this.body;
    }

}
