// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListTopologyGroupRiskValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTopologyGroupRiskValuesResponseBody body;

    public static ListTopologyGroupRiskValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopologyGroupRiskValuesResponse self = new ListTopologyGroupRiskValuesResponse();
        return TeaModel.build(map, self);
    }

    public ListTopologyGroupRiskValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTopologyGroupRiskValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTopologyGroupRiskValuesResponse setBody(ListTopologyGroupRiskValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTopologyGroupRiskValuesResponseBody getBody() {
        return this.body;
    }

}
