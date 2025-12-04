// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneralConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGeneralConfigsResponseBody body;

    public static ListGeneralConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGeneralConfigsResponse self = new ListGeneralConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListGeneralConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGeneralConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGeneralConfigsResponse setBody(ListGeneralConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGeneralConfigsResponseBody getBody() {
        return this.body;
    }

}
