// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetStaStatusListByApResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStaStatusListByApResponseBody body;

    public static GetStaStatusListByApResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStaStatusListByApResponse self = new GetStaStatusListByApResponse();
        return TeaModel.build(map, self);
    }

    public GetStaStatusListByApResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStaStatusListByApResponse setBody(GetStaStatusListByApResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStaStatusListByApResponseBody getBody() {
        return this.body;
    }

}
