// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class DownloadPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    public static DownloadPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadPackageResponse self = new DownloadPackageResponse();
        return TeaModel.build(map, self);
    }

    public DownloadPackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadPackageResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
