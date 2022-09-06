// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySpeechLicenseDeviceListResponseBody body;

    public static QuerySpeechLicenseDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechLicenseDeviceListResponse self = new QuerySpeechLicenseDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechLicenseDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpeechLicenseDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpeechLicenseDeviceListResponse setBody(QuerySpeechLicenseDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpeechLicenseDeviceListResponseBody getBody() {
        return this.body;
    }

}
