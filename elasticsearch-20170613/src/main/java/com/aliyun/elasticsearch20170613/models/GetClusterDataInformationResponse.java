// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetClusterDataInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetClusterDataInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterDataInformationResponse setBody(GetClusterDataInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterDataInformationResponseBody getBody() {
        return this.body;
    }

}
