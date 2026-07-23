// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineBuildConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoutineBuildConfigurationsResponseBody body;

    public static ListRoutineBuildConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineBuildConfigurationsResponse self = new ListRoutineBuildConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListRoutineBuildConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoutineBuildConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoutineBuildConfigurationsResponse setBody(ListRoutineBuildConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoutineBuildConfigurationsResponseBody getBody() {
        return this.body;
    }

}
