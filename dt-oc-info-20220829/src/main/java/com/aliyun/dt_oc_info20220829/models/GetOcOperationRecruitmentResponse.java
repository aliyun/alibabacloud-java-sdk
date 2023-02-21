// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcOperationRecruitmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcOperationRecruitmentResponseBody body;

    public static GetOcOperationRecruitmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcOperationRecruitmentResponse self = new GetOcOperationRecruitmentResponse();
        return TeaModel.build(map, self);
    }

    public GetOcOperationRecruitmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcOperationRecruitmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcOperationRecruitmentResponse setBody(GetOcOperationRecruitmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcOperationRecruitmentResponseBody getBody() {
        return this.body;
    }

}
