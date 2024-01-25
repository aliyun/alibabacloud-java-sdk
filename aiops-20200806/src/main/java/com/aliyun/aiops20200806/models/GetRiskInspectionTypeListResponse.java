// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskInspectionTypeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskInspectionTypeListResponseBody body;

    public static GetRiskInspectionTypeListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskInspectionTypeListResponse self = new GetRiskInspectionTypeListResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskInspectionTypeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskInspectionTypeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskInspectionTypeListResponse setBody(GetRiskInspectionTypeListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskInspectionTypeListResponseBody getBody() {
        return this.body;
    }

}
