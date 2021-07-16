// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemEffectionServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProblemEffectionServiceResponseBody body;

    public static GetProblemEffectionServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProblemEffectionServiceResponse self = new GetProblemEffectionServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetProblemEffectionServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProblemEffectionServiceResponse setBody(GetProblemEffectionServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

}
