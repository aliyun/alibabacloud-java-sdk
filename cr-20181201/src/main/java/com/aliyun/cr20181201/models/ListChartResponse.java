// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChartResponseBody body;

    public static ListChartResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChartResponse self = new ListChartResponse();
        return TeaModel.build(map, self);
    }

    public ListChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChartResponse setBody(ListChartResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChartResponseBody getBody() {
        return this.body;
    }

}
