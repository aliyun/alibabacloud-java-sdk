// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class YaochiSuggestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public YaochiSuggestResponseBody body;

    public static YaochiSuggestResponse build(java.util.Map<String, ?> map) throws Exception {
        YaochiSuggestResponse self = new YaochiSuggestResponse();
        return TeaModel.build(map, self);
    }

    public YaochiSuggestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public YaochiSuggestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public YaochiSuggestResponse setBody(YaochiSuggestResponseBody body) {
        this.body = body;
        return this;
    }
    public YaochiSuggestResponseBody getBody() {
        return this.body;
    }

}
