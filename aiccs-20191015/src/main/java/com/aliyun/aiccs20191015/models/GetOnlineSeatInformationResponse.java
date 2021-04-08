// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineSeatInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOnlineSeatInformationResponseBody body;

    public static GetOnlineSeatInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineSeatInformationResponse self = new GetOnlineSeatInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetOnlineSeatInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOnlineSeatInformationResponse setBody(GetOnlineSeatInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOnlineSeatInformationResponseBody getBody() {
        return this.body;
    }

}
