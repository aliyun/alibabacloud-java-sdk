// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstanceByTagAndResourceGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody body;

    public static ListPrometheusInstanceByTagAndResourceGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstanceByTagAndResourceGroupIdResponse self = new ListPrometheusInstanceByTagAndResourceGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdResponse setBody(ListPrometheusInstanceByTagAndResourceGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody getBody() {
        return this.body;
    }

}
