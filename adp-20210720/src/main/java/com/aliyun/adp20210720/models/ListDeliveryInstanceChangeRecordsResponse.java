// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListDeliveryInstanceChangeRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeliveryInstanceChangeRecordsResponseBody body;

    public static ListDeliveryInstanceChangeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryInstanceChangeRecordsResponse self = new ListDeliveryInstanceChangeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeliveryInstanceChangeRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeliveryInstanceChangeRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeliveryInstanceChangeRecordsResponse setBody(ListDeliveryInstanceChangeRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeliveryInstanceChangeRecordsResponseBody getBody() {
        return this.body;
    }

}
