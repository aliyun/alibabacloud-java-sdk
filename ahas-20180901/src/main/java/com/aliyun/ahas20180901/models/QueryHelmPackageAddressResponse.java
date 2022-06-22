// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryHelmPackageAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHelmPackageAddressResponseBody body;

    public static QueryHelmPackageAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHelmPackageAddressResponse self = new QueryHelmPackageAddressResponse();
        return TeaModel.build(map, self);
    }

    public QueryHelmPackageAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHelmPackageAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHelmPackageAddressResponse setBody(QueryHelmPackageAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHelmPackageAddressResponseBody getBody() {
        return this.body;
    }

}
