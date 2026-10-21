// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetIncidentInvestigationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIncidentInvestigationResponseBody body;

    public static GetIncidentInvestigationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentInvestigationResponse self = new GetIncidentInvestigationResponse();
        return TeaModel.build(map, self);
    }

    public GetIncidentInvestigationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIncidentInvestigationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIncidentInvestigationResponse setBody(GetIncidentInvestigationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIncidentInvestigationResponseBody getBody() {
        return this.body;
    }

}
