// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveEditingJobResponseBody body;

    public static GetLiveEditingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingJobResponse self = new GetLiveEditingJobResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveEditingJobResponse setBody(GetLiveEditingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveEditingJobResponseBody getBody() {
        return this.body;
    }

}
