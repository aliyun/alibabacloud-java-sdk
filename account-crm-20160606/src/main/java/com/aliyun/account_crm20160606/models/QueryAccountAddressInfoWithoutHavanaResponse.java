// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountAddressInfoWithoutHavanaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountAddressInfoWithoutHavanaResponseBody body;

    public static QueryAccountAddressInfoWithoutHavanaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountAddressInfoWithoutHavanaResponse self = new QueryAccountAddressInfoWithoutHavanaResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountAddressInfoWithoutHavanaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountAddressInfoWithoutHavanaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountAddressInfoWithoutHavanaResponse setBody(QueryAccountAddressInfoWithoutHavanaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountAddressInfoWithoutHavanaResponseBody getBody() {
        return this.body;
    }

}
