// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBudgetTicketItemListByBizIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBudgetTicketItemListByBizIdResponseBody body;

    public static QueryBudgetTicketItemListByBizIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBudgetTicketItemListByBizIdResponse self = new QueryBudgetTicketItemListByBizIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryBudgetTicketItemListByBizIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBudgetTicketItemListByBizIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBudgetTicketItemListByBizIdResponse setBody(QueryBudgetTicketItemListByBizIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBudgetTicketItemListByBizIdResponseBody getBody() {
        return this.body;
    }

}
