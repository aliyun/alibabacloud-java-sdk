// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ListWhitelistTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWhitelistTemplatesResponseBody body;

    public static ListWhitelistTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWhitelistTemplatesResponse self = new ListWhitelistTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListWhitelistTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWhitelistTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWhitelistTemplatesResponse setBody(ListWhitelistTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWhitelistTemplatesResponseBody getBody() {
        return this.body;
    }

}
