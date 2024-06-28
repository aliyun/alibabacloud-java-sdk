// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCommonTicketFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommonTicketFieldsResponseBody body;

    public static ListCommonTicketFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommonTicketFieldsResponse self = new ListCommonTicketFieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListCommonTicketFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommonTicketFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommonTicketFieldsResponse setBody(ListCommonTicketFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommonTicketFieldsResponseBody getBody() {
        return this.body;
    }

}
