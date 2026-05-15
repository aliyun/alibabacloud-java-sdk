// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListIMBotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIMBotsResult body;

    public static ListIMBotsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIMBotsResponse self = new ListIMBotsResponse();
        return TeaModel.build(map, self);
    }

    public ListIMBotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIMBotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIMBotsResponse setBody(ListIMBotsResult body) {
        this.body = body;
        return this;
    }
    public ListIMBotsResult getBody() {
        return this.body;
    }

}
