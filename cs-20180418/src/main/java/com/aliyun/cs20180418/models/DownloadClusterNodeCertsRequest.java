// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DownloadClusterNodeCertsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DownloadClusterNodeCertsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadClusterNodeCertsRequest self = new DownloadClusterNodeCertsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadClusterNodeCertsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
