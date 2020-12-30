// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class QuerySchedruleOnDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QuerySchedruleOnDemandResponse setBody(QuerySchedruleOnDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

}
