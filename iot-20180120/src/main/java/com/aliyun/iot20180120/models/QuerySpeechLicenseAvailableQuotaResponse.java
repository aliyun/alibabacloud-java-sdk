// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseAvailableQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySpeechLicenseAvailableQuotaResponseBody body;

    public static QuerySpeechLicenseAvailableQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechLicenseAvailableQuotaResponse self = new QuerySpeechLicenseAvailableQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechLicenseAvailableQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpeechLicenseAvailableQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpeechLicenseAvailableQuotaResponse setBody(QuerySpeechLicenseAvailableQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpeechLicenseAvailableQuotaResponseBody getBody() {
        return this.body;
    }

}
