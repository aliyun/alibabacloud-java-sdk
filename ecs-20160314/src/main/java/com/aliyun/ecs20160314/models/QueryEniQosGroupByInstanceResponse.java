// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class QueryEniQosGroupByInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEniQosGroupByInstanceResponseBody body;

    public static QueryEniQosGroupByInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEniQosGroupByInstanceResponse self = new QueryEniQosGroupByInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEniQosGroupByInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEniQosGroupByInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEniQosGroupByInstanceResponse setBody(QueryEniQosGroupByInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEniQosGroupByInstanceResponseBody getBody() {
        return this.body;
    }

}
