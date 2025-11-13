// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAiRtcLicenseInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiRtcLicenseInfoListResponseBody body;

    public static GetAiRtcLicenseInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiRtcLicenseInfoListResponse self = new GetAiRtcLicenseInfoListResponse();
        return TeaModel.build(map, self);
    }

    public GetAiRtcLicenseInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiRtcLicenseInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiRtcLicenseInfoListResponse setBody(GetAiRtcLicenseInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiRtcLicenseInfoListResponseBody getBody() {
        return this.body;
    }

}
