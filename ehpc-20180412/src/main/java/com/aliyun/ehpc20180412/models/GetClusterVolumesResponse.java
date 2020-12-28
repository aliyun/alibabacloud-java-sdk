// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetClusterVolumesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetClusterVolumesResponse setBody(GetClusterVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterVolumesResponseBody getBody() {
        return this.body;
    }

}
