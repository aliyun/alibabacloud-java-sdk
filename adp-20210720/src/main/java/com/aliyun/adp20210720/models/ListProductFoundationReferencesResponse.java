// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductFoundationReferencesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductFoundationReferencesResponseBody body;

    public static ListProductFoundationReferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductFoundationReferencesResponse self = new ListProductFoundationReferencesResponse();
        return TeaModel.build(map, self);
    }

    public ListProductFoundationReferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductFoundationReferencesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductFoundationReferencesResponse setBody(ListProductFoundationReferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductFoundationReferencesResponseBody getBody() {
        return this.body;
    }

}
