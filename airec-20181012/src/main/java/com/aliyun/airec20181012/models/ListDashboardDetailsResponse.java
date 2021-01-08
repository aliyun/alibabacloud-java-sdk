// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDashboardDetailsResponseBody body;

    public static ListDashboardDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsResponse self = new ListDashboardDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardDetailsResponse setBody(ListDashboardDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardDetailsResponseBody getBody() {
        return this.body;
    }

}
