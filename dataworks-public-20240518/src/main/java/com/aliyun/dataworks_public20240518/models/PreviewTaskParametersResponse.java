// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PreviewTaskParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewTaskParametersResponseBody body;

    public static PreviewTaskParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewTaskParametersResponse self = new PreviewTaskParametersResponse();
        return TeaModel.build(map, self);
    }

    public PreviewTaskParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewTaskParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewTaskParametersResponse setBody(PreviewTaskParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewTaskParametersResponseBody getBody() {
        return this.body;
    }

}
