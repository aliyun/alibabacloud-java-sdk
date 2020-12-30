// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIllegalUrlExportTaskResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    public static DescribeIllegalUrlExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIllegalUrlExportTaskResponseBody self = new DescribeIllegalUrlExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIllegalUrlExportTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeIllegalUrlExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIllegalUrlExportTaskResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

}
