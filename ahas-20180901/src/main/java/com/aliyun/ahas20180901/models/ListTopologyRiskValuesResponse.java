// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListTopologyRiskValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTopologyRiskValuesResponseBody body;

    public static ListTopologyRiskValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopologyRiskValuesResponse self = new ListTopologyRiskValuesResponse();
        return TeaModel.build(map, self);
    }

    public ListTopologyRiskValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTopologyRiskValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTopologyRiskValuesResponse setBody(ListTopologyRiskValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTopologyRiskValuesResponseBody getBody() {
        return this.body;
    }

}
