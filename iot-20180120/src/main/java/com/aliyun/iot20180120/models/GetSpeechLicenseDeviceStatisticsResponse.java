// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechLicenseDeviceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpeechLicenseDeviceStatisticsResponseBody body;

    public static GetSpeechLicenseDeviceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechLicenseDeviceStatisticsResponse self = new GetSpeechLicenseDeviceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetSpeechLicenseDeviceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpeechLicenseDeviceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpeechLicenseDeviceStatisticsResponse setBody(GetSpeechLicenseDeviceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpeechLicenseDeviceStatisticsResponseBody getBody() {
        return this.body;
    }

}
