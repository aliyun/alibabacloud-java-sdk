// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemPreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProblemPreviewResponseBody body;

    public static GetProblemPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProblemPreviewResponse self = new GetProblemPreviewResponse();
        return TeaModel.build(map, self);
    }

    public GetProblemPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProblemPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProblemPreviewResponse setBody(GetProblemPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProblemPreviewResponseBody getBody() {
        return this.body;
    }

}
