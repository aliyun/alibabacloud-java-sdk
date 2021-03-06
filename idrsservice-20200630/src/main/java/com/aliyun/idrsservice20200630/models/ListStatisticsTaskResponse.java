// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListStatisticsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStatisticsTaskResponseBody body;

    public static ListStatisticsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticsTaskResponse self = new ListStatisticsTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListStatisticsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStatisticsTaskResponse setBody(ListStatisticsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStatisticsTaskResponseBody getBody() {
        return this.body;
    }

}
