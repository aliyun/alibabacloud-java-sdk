// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListOnDemandConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOnDemandConfigsResponseBody body;

    public static ListOnDemandConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOnDemandConfigsResponse self = new ListOnDemandConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListOnDemandConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOnDemandConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOnDemandConfigsResponse setBody(ListOnDemandConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOnDemandConfigsResponseBody getBody() {
        return this.body;
    }

}
