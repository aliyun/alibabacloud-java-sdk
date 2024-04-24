// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableSqlFlashbackMatchSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSqlFlashbackMatchSwitchResponseBody body;

    public static EnableSqlFlashbackMatchSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlFlashbackMatchSwitchResponse self = new EnableSqlFlashbackMatchSwitchResponse();
        return TeaModel.build(map, self);
    }

    public EnableSqlFlashbackMatchSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSqlFlashbackMatchSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSqlFlashbackMatchSwitchResponse setBody(EnableSqlFlashbackMatchSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSqlFlashbackMatchSwitchResponseBody getBody() {
        return this.body;
    }

}
