// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class UpdateTicketRecordByticketCodePopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTicketRecordByticketCodePopResponseBody body;

    public static UpdateTicketRecordByticketCodePopResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketRecordByticketCodePopResponse self = new UpdateTicketRecordByticketCodePopResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTicketRecordByticketCodePopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTicketRecordByticketCodePopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTicketRecordByticketCodePopResponse setBody(UpdateTicketRecordByticketCodePopResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTicketRecordByticketCodePopResponseBody getBody() {
        return this.body;
    }

}
