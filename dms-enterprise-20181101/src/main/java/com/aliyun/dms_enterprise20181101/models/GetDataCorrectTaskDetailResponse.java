// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDataCorrectTaskDetailResponse setBody(GetDataCorrectTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCorrectTaskDetailResponseBody getBody() {
        return this.body;
    }

}
