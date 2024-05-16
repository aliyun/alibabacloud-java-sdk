// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDefaultTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgQueryDefaultTemplatesResponseBody body;

    public static DsgQueryDefaultTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryDefaultTemplatesResponse self = new DsgQueryDefaultTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DsgQueryDefaultTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgQueryDefaultTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgQueryDefaultTemplatesResponse setBody(DsgQueryDefaultTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgQueryDefaultTemplatesResponseBody getBody() {
        return this.body;
    }

}
