// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApmMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApmMetadataResponseBody body;

    public static ListApmMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApmMetadataResponse self = new ListApmMetadataResponse();
        return TeaModel.build(map, self);
    }

    public ListApmMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApmMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApmMetadataResponse setBody(ListApmMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApmMetadataResponseBody getBody() {
        return this.body;
    }

}
