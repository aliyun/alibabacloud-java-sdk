// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMonitorDataResponseBody body;

    public static ListMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorDataResponse self = new ListMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public ListMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMonitorDataResponse setBody(ListMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMonitorDataResponseBody getBody() {
        return this.body;
    }

}
