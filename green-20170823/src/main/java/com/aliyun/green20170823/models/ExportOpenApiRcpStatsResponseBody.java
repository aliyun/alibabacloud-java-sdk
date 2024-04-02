// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ExportOpenApiRcpStatsResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportOpenApiRcpStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportOpenApiRcpStatsResponseBody self = new ExportOpenApiRcpStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportOpenApiRcpStatsResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public ExportOpenApiRcpStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
