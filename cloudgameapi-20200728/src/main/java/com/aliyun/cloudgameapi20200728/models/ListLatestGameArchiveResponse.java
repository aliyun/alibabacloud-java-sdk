// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListLatestGameArchiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLatestGameArchiveResponseBody body;

    public static ListLatestGameArchiveResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLatestGameArchiveResponse self = new ListLatestGameArchiveResponse();
        return TeaModel.build(map, self);
    }

    public ListLatestGameArchiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLatestGameArchiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLatestGameArchiveResponse setBody(ListLatestGameArchiveResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLatestGameArchiveResponseBody getBody() {
        return this.body;
    }

}
