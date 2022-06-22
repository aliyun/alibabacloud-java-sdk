// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ExperimentTaskOverviewIgnoreNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExperimentTaskOverviewIgnoreNamespaceResponseBody body;

    public static ExperimentTaskOverviewIgnoreNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExperimentTaskOverviewIgnoreNamespaceResponse self = new ExperimentTaskOverviewIgnoreNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ExperimentTaskOverviewIgnoreNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExperimentTaskOverviewIgnoreNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExperimentTaskOverviewIgnoreNamespaceResponse setBody(ExperimentTaskOverviewIgnoreNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExperimentTaskOverviewIgnoreNamespaceResponseBody getBody() {
        return this.body;
    }

}
