// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLicenseDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLicenseDeviceListResponseBody body;

    public static QueryLicenseDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLicenseDeviceListResponse self = new QueryLicenseDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryLicenseDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLicenseDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLicenseDeviceListResponse setBody(QueryLicenseDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLicenseDeviceListResponseBody getBody() {
        return this.body;
    }

}
