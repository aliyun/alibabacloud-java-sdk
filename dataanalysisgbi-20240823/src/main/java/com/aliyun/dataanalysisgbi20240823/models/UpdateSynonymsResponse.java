// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateSynonymsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSynonymsResponseBody body;

    public static UpdateSynonymsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSynonymsResponse self = new UpdateSynonymsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSynonymsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSynonymsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSynonymsResponse setBody(UpdateSynonymsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSynonymsResponseBody getBody() {
        return this.body;
    }

}
