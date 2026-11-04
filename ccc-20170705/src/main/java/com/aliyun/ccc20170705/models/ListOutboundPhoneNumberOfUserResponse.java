// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListOutboundPhoneNumberOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOutboundPhoneNumberOfUserResponseBody body;

    public static ListOutboundPhoneNumberOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundPhoneNumberOfUserResponse self = new ListOutboundPhoneNumberOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListOutboundPhoneNumberOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOutboundPhoneNumberOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOutboundPhoneNumberOfUserResponse setBody(ListOutboundPhoneNumberOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOutboundPhoneNumberOfUserResponseBody getBody() {
        return this.body;
    }

}
