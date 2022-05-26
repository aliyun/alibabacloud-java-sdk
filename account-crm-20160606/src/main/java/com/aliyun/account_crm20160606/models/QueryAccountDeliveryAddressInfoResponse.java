// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountDeliveryAddressInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountDeliveryAddressInfoResponseBody body;

    public static QueryAccountDeliveryAddressInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountDeliveryAddressInfoResponse self = new QueryAccountDeliveryAddressInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountDeliveryAddressInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountDeliveryAddressInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountDeliveryAddressInfoResponse setBody(QueryAccountDeliveryAddressInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountDeliveryAddressInfoResponseBody getBody() {
        return this.body;
    }

}
