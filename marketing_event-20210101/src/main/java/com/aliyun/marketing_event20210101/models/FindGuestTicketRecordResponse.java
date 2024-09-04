// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class FindGuestTicketRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindGuestTicketRecordResponseBody body;

    public static FindGuestTicketRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        FindGuestTicketRecordResponse self = new FindGuestTicketRecordResponse();
        return TeaModel.build(map, self);
    }

    public FindGuestTicketRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindGuestTicketRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindGuestTicketRecordResponse setBody(FindGuestTicketRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public FindGuestTicketRecordResponseBody getBody() {
        return this.body;
    }

}
