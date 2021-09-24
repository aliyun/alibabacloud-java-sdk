// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSimilarIncidentStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSimilarIncidentStatisticsResponseBody body;

    public static GetSimilarIncidentStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarIncidentStatisticsResponse self = new GetSimilarIncidentStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetSimilarIncidentStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSimilarIncidentStatisticsResponse setBody(GetSimilarIncidentStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSimilarIncidentStatisticsResponseBody getBody() {
        return this.body;
    }

}
