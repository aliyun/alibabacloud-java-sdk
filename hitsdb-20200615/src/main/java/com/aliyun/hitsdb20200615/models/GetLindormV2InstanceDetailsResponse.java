// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormV2InstanceDetailsResponseBody body;

    public static GetLindormV2InstanceDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceDetailsResponse self = new GetLindormV2InstanceDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormV2InstanceDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormV2InstanceDetailsResponse setBody(GetLindormV2InstanceDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormV2InstanceDetailsResponseBody getBody() {
        return this.body;
    }

}
