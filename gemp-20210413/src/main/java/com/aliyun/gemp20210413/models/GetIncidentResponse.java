// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIncidentResponseBody body;

    public static GetIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentResponse self = new GetIncidentResponse();
        return TeaModel.build(map, self);
    }

    public GetIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIncidentResponse setBody(GetIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIncidentResponseBody getBody() {
        return this.body;
    }

}
