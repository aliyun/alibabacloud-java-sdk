// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBExportTaskStatusResponseBody extends TeaModel {
    @NameInMap("DetailMessage")
    public String detailMessage;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("ExportedCount")
    public String exportedCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static QueryDBExportTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDBExportTaskStatusResponseBody self = new QueryDBExportTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDBExportTaskStatusResponseBody setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }
    public String getDetailMessage() {
        return this.detailMessage;
    }

    public QueryDBExportTaskStatusResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public QueryDBExportTaskStatusResponseBody setExportedCount(String exportedCount) {
        this.exportedCount = exportedCount;
        return this;
    }
    public String getExportedCount() {
        return this.exportedCount;
    }

    public QueryDBExportTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDBExportTaskStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
