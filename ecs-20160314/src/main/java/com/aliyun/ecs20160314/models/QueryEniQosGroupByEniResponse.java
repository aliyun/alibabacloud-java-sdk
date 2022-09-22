// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class QueryEniQosGroupByEniResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEniQosGroupByEniResponseBody body;

    public static QueryEniQosGroupByEniResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEniQosGroupByEniResponse self = new QueryEniQosGroupByEniResponse();
        return TeaModel.build(map, self);
    }

    public QueryEniQosGroupByEniResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEniQosGroupByEniResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEniQosGroupByEniResponse setBody(QueryEniQosGroupByEniResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEniQosGroupByEniResponseBody getBody() {
        return this.body;
    }

}
