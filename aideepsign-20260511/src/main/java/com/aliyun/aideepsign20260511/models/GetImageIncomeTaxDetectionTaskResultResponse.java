// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageIncomeTaxDetectionTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageIncomeTaxDetectionTaskResultResponseBody body;

    public static GetImageIncomeTaxDetectionTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageIncomeTaxDetectionTaskResultResponse self = new GetImageIncomeTaxDetectionTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetImageIncomeTaxDetectionTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageIncomeTaxDetectionTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageIncomeTaxDetectionTaskResultResponse setBody(GetImageIncomeTaxDetectionTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageIncomeTaxDetectionTaskResultResponseBody getBody() {
        return this.body;
    }

}
