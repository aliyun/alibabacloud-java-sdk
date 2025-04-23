// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRamPolicyExportTaskVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRamPolicyExportTaskVersionResponseBody body;

    public static GetRamPolicyExportTaskVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRamPolicyExportTaskVersionResponse self = new GetRamPolicyExportTaskVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetRamPolicyExportTaskVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRamPolicyExportTaskVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRamPolicyExportTaskVersionResponse setBody(GetRamPolicyExportTaskVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRamPolicyExportTaskVersionResponseBody getBody() {
        return this.body;
    }

}
