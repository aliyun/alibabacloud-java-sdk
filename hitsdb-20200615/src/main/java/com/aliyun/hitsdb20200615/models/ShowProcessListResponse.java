// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ShowProcessListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShowProcessListResponseBody body;

    public static ShowProcessListResponse build(java.util.Map<String, ?> map) throws Exception {
        ShowProcessListResponse self = new ShowProcessListResponse();
        return TeaModel.build(map, self);
    }

    public ShowProcessListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShowProcessListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShowProcessListResponse setBody(ShowProcessListResponseBody body) {
        this.body = body;
        return this;
    }
    public ShowProcessListResponseBody getBody() {
        return this.body;
    }

}
