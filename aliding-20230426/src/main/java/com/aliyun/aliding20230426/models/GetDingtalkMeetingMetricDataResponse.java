// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDingtalkMeetingMetricDataResponseBody body;

    public static GetDingtalkMeetingMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMetricDataResponse self = new GetDingtalkMeetingMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDingtalkMeetingMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDingtalkMeetingMetricDataResponse setBody(GetDingtalkMeetingMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDingtalkMeetingMetricDataResponseBody getBody() {
        return this.body;
    }

}
