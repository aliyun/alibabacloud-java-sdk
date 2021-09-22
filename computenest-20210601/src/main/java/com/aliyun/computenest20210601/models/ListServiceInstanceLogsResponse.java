// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceInstanceLogsResponseBody body;

    public static ListServiceInstanceLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceLogsResponse self = new ListServiceInstanceLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstanceLogsResponse setBody(ListServiceInstanceLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstanceLogsResponseBody getBody() {
        return this.body;
    }

}
