// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationProvisioningsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessConfigurationProvisioningsResponseBody body;

    public static ListAccessConfigurationProvisioningsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationProvisioningsResponse self = new ListAccessConfigurationProvisioningsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationProvisioningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessConfigurationProvisioningsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessConfigurationProvisioningsResponse setBody(ListAccessConfigurationProvisioningsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessConfigurationProvisioningsResponseBody getBody() {
        return this.body;
    }

}
