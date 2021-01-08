// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDashboardParametersResponseBody body;

    public static ListDashboardParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardParametersResponse self = new ListDashboardParametersResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardParametersResponse setBody(ListDashboardParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardParametersResponseBody getBody() {
        return this.body;
    }

}
