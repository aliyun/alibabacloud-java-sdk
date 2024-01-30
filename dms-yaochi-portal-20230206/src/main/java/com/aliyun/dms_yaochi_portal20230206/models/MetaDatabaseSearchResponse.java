// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class MetaDatabaseSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MetaDatabaseSearchResponseBody body;

    public static MetaDatabaseSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        MetaDatabaseSearchResponse self = new MetaDatabaseSearchResponse();
        return TeaModel.build(map, self);
    }

    public MetaDatabaseSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MetaDatabaseSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MetaDatabaseSearchResponse setBody(MetaDatabaseSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public MetaDatabaseSearchResponseBody getBody() {
        return this.body;
    }

}
