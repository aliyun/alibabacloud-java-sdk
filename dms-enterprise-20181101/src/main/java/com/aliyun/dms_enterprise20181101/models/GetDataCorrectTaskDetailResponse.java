// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCorrectTaskDetailResponseBody body;

    public static GetDataCorrectTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectTaskDetailResponse self = new GetDataCorrectTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCorrectTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCorrectTaskDetailResponse setBody(GetDataCorrectTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCorrectTaskDetailResponseBody getBody() {
        return this.body;
    }

}
