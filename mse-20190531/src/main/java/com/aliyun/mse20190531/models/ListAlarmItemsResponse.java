// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlarmItemsResponseBody body;

    public static ListAlarmItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmItemsResponse self = new ListAlarmItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmItemsResponse setBody(ListAlarmItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmItemsResponseBody getBody() {
        return this.body;
    }

}
