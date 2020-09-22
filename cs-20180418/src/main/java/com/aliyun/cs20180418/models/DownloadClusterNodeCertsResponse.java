// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DownloadClusterNodeCertsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DownloadClusterNodeCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadClusterNodeCertsResponse self = new DownloadClusterNodeCertsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadClusterNodeCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
