// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ImportK8sClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportK8sClusterResponseBody body;

    public static ImportK8sClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportK8sClusterResponse self = new ImportK8sClusterResponse();
        return TeaModel.build(map, self);
    }

    public ImportK8sClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportK8sClusterResponse setBody(ImportK8sClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportK8sClusterResponseBody getBody() {
        return this.body;
    }

}
