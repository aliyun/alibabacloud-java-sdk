// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentListByIdListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIncidentListByIdListResponseBody body;

    public static GetIncidentListByIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentListByIdListResponse self = new GetIncidentListByIdListResponse();
        return TeaModel.build(map, self);
    }

    public GetIncidentListByIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIncidentListByIdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIncidentListByIdListResponse setBody(GetIncidentListByIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIncidentListByIdListResponseBody getBody() {
        return this.body;
    }

}
