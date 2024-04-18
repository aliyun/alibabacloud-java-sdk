// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListInstanceServiceConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceServiceConfigurationsResponseBody body;

    public static ListInstanceServiceConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceServiceConfigurationsResponse self = new ListInstanceServiceConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceServiceConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceServiceConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceServiceConfigurationsResponse setBody(ListInstanceServiceConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceServiceConfigurationsResponseBody getBody() {
        return this.body;
    }

}
