// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListLogisticsOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LogisticsOrderListResult body;

    public static ListLogisticsOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogisticsOrdersResponse self = new ListLogisticsOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListLogisticsOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogisticsOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogisticsOrdersResponse setBody(LogisticsOrderListResult body) {
        this.body = body;
        return this;
    }
    public LogisticsOrderListResult getBody() {
        return this.body;
    }

}
