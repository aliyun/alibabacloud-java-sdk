// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportPreCheckDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataExportPreCheckDetailResponseBody body;

    public static GetDataExportPreCheckDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportPreCheckDetailResponse self = new GetDataExportPreCheckDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataExportPreCheckDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataExportPreCheckDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataExportPreCheckDetailResponse setBody(GetDataExportPreCheckDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataExportPreCheckDetailResponseBody getBody() {
        return this.body;
    }

}
