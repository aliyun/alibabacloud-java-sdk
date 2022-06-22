// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListApplicationConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationConfigurationsResponseBody body;

    public static ListApplicationConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationConfigurationsResponse self = new ListApplicationConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationConfigurationsResponse setBody(ListApplicationConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationConfigurationsResponseBody getBody() {
        return this.body;
    }

}
