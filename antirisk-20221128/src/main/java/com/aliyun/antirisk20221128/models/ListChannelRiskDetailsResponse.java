// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class ListChannelRiskDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChannelRiskDetailsResponseBody body;

    public static ListChannelRiskDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChannelRiskDetailsResponse self = new ListChannelRiskDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListChannelRiskDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChannelRiskDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChannelRiskDetailsResponse setBody(ListChannelRiskDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChannelRiskDetailsResponseBody getBody() {
        return this.body;
    }

}
