// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBudgetTicketItemListByBizIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryBudgetTicketItemListByBizIdResponse setBody(QueryBudgetTicketItemListByBizIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBudgetTicketItemListByBizIdResponseBody getBody() {
        return this.body;
    }

}
