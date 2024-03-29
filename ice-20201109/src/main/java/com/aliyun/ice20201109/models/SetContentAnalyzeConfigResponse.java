// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetContentAnalyzeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetContentAnalyzeConfigResponseBody body;

    public static SetContentAnalyzeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetContentAnalyzeConfigResponse self = new SetContentAnalyzeConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetContentAnalyzeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetContentAnalyzeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetContentAnalyzeConfigResponse setBody(SetContentAnalyzeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetContentAnalyzeConfigResponseBody getBody() {
        return this.body;
    }

}
