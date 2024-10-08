// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentSubtotalCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIncidentSubtotalCountResponseBody body;

    public static GetIncidentSubtotalCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentSubtotalCountResponse self = new GetIncidentSubtotalCountResponse();
        return TeaModel.build(map, self);
    }

    public GetIncidentSubtotalCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIncidentSubtotalCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIncidentSubtotalCountResponse setBody(GetIncidentSubtotalCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIncidentSubtotalCountResponseBody getBody() {
        return this.body;
    }

}
