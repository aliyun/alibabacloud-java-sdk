// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIpMappingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpMappingRulesResponseBody body;

    public static ListIpMappingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpMappingRulesResponse self = new ListIpMappingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListIpMappingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpMappingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpMappingRulesResponse setBody(ListIpMappingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpMappingRulesResponseBody getBody() {
        return this.body;
    }

}
