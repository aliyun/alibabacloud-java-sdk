// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardDayUsagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCardDayUsagesResponseBody body;

    public static ListCardDayUsagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCardDayUsagesResponse self = new ListCardDayUsagesResponse();
        return TeaModel.build(map, self);
    }

    public ListCardDayUsagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCardDayUsagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCardDayUsagesResponse setBody(ListCardDayUsagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCardDayUsagesResponseBody getBody() {
        return this.body;
    }

}
