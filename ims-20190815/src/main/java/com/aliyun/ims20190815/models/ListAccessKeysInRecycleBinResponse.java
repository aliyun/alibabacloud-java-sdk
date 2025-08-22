// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAccessKeysInRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessKeysInRecycleBinResponseBody body;

    public static ListAccessKeysInRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysInRecycleBinResponse self = new ListAccessKeysInRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysInRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessKeysInRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessKeysInRecycleBinResponse setBody(ListAccessKeysInRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessKeysInRecycleBinResponseBody getBody() {
        return this.body;
    }

}
