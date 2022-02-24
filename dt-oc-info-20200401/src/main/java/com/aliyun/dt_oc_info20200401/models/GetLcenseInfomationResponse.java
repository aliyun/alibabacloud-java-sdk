// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetLcenseInfomationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLcenseInfomationResponseBody body;

    public static GetLcenseInfomationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLcenseInfomationResponse self = new GetLcenseInfomationResponse();
        return TeaModel.build(map, self);
    }

    public GetLcenseInfomationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLcenseInfomationResponse setBody(GetLcenseInfomationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLcenseInfomationResponseBody getBody() {
        return this.body;
    }

}
