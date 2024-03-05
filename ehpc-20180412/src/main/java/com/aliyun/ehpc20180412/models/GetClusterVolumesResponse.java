// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetClusterVolumesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterVolumesResponseBody body;

    public static GetClusterVolumesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterVolumesResponse self = new GetClusterVolumesResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterVolumesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterVolumesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterVolumesResponse setBody(GetClusterVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterVolumesResponseBody getBody() {
        return this.body;
    }

}
