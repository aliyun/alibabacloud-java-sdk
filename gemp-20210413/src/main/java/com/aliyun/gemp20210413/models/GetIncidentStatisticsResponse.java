// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIncidentStatisticsResponseBody body;

    public static GetIncidentStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentStatisticsResponse self = new GetIncidentStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetIncidentStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIncidentStatisticsResponse setBody(GetIncidentStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIncidentStatisticsResponseBody getBody() {
        return this.body;
    }

}
