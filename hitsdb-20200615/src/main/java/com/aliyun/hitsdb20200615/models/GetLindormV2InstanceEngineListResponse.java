// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceEngineListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormV2InstanceEngineListResponseBody body;

    public static GetLindormV2InstanceEngineListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceEngineListResponse self = new GetLindormV2InstanceEngineListResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceEngineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormV2InstanceEngineListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormV2InstanceEngineListResponse setBody(GetLindormV2InstanceEngineListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormV2InstanceEngineListResponseBody getBody() {
        return this.body;
    }

}
