// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetResponseRuleStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResponseRuleStatisticResponseBody body;

    public static GetResponseRuleStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResponseRuleStatisticResponse self = new GetResponseRuleStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetResponseRuleStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResponseRuleStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResponseRuleStatisticResponse setBody(GetResponseRuleStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResponseRuleStatisticResponseBody getBody() {
        return this.body;
    }

}
