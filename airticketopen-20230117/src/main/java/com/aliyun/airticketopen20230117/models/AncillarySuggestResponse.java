// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AncillarySuggestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AncillarySuggestResponseBody body;

    public static AncillarySuggestResponse build(java.util.Map<String, ?> map) throws Exception {
        AncillarySuggestResponse self = new AncillarySuggestResponse();
        return TeaModel.build(map, self);
    }

    public AncillarySuggestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AncillarySuggestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AncillarySuggestResponse setBody(AncillarySuggestResponseBody body) {
        this.body = body;
        return this;
    }
    public AncillarySuggestResponseBody getBody() {
        return this.body;
    }

}
