// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class QueryCustomerLabelByConfigGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomerLabelByConfigGroupResponseBody body;

    public static QueryCustomerLabelByConfigGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerLabelByConfigGroupResponse self = new QueryCustomerLabelByConfigGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerLabelByConfigGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomerLabelByConfigGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomerLabelByConfigGroupResponse setBody(QueryCustomerLabelByConfigGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomerLabelByConfigGroupResponseBody getBody() {
        return this.body;
    }

}
