// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class MetaSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MetaSearchResponseBody body;

    public static MetaSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        MetaSearchResponse self = new MetaSearchResponse();
        return TeaModel.build(map, self);
    }

    public MetaSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MetaSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MetaSearchResponse setBody(MetaSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public MetaSearchResponseBody getBody() {
        return this.body;
    }

}
