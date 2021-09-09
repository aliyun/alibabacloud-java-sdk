// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetClusterDataInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterDataInformationResponseBody body;

    public static GetClusterDataInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDataInformationResponse self = new GetClusterDataInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterDataInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterDataInformationResponse setBody(GetClusterDataInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterDataInformationResponseBody getBody() {
        return this.body;
    }

}
