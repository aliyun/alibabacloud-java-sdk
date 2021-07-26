// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleDutyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScheduleDutyResponseBody body;

    public static GetScheduleDutyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleDutyResponse self = new GetScheduleDutyResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduleDutyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduleDutyResponse setBody(GetScheduleDutyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduleDutyResponseBody getBody() {
        return this.body;
    }

}
