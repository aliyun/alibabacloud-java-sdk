// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListOnCallSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOnCallSchedulesResponseBody body;

    public static ListOnCallSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOnCallSchedulesResponse self = new ListOnCallSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public ListOnCallSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOnCallSchedulesResponse setBody(ListOnCallSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOnCallSchedulesResponseBody getBody() {
        return this.body;
    }

}
