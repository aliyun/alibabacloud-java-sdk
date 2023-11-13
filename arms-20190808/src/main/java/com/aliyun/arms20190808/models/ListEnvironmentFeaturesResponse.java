// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentFeaturesResponseBody body;

    public static ListEnvironmentFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentFeaturesResponse self = new ListEnvironmentFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentFeaturesResponse setBody(ListEnvironmentFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentFeaturesResponseBody getBody() {
        return this.body;
    }

}
