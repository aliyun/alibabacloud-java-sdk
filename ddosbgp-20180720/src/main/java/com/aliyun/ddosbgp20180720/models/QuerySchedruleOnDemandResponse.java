// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class QuerySchedruleOnDemandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySchedruleOnDemandResponseBody body;

    public static QuerySchedruleOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySchedruleOnDemandResponse self = new QuerySchedruleOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public QuerySchedruleOnDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySchedruleOnDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySchedruleOnDemandResponse setBody(QuerySchedruleOnDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

}
