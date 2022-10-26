// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderLogisticsWithDesignatedTbUidResponseBody body;

    public static QueryOrderLogisticsWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsWithDesignatedTbUidResponse self = new QueryOrderLogisticsWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponse setBody(QueryOrderLogisticsWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderLogisticsWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
