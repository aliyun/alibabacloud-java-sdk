// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateClusterVolumesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClusterVolumesResponseBody body;

    public static UpdateClusterVolumesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterVolumesResponse self = new UpdateClusterVolumesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterVolumesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterVolumesResponse setBody(UpdateClusterVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterVolumesResponseBody getBody() {
        return this.body;
    }

}
