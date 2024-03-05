// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCurrentClientVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCurrentClientVersionResponseBody body;

    public static ListCurrentClientVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentClientVersionResponse self = new ListCurrentClientVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListCurrentClientVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCurrentClientVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCurrentClientVersionResponse setBody(ListCurrentClientVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCurrentClientVersionResponseBody getBody() {
        return this.body;
    }

}
