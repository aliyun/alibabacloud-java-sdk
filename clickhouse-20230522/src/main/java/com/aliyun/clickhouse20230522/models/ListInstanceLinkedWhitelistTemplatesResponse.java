// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ListInstanceLinkedWhitelistTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceLinkedWhitelistTemplatesResponseBody body;

    public static ListInstanceLinkedWhitelistTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceLinkedWhitelistTemplatesResponse self = new ListInstanceLinkedWhitelistTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceLinkedWhitelistTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceLinkedWhitelistTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceLinkedWhitelistTemplatesResponse setBody(ListInstanceLinkedWhitelistTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceLinkedWhitelistTemplatesResponseBody getBody() {
        return this.body;
    }

}
