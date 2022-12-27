// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIllegalUrlExportTaskResponseBody extends TeaModel {
    // The URL where you can download the file that contains invalid URLs. This parameter is valid only if the export task is successful.
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The status of the export task. A value of **complete** indicates that the task is successful.
    @NameInMap("Status")
    public String status;

    public static DescribeIllegalUrlExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIllegalUrlExportTaskResponseBody self = new DescribeIllegalUrlExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIllegalUrlExportTaskResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DescribeIllegalUrlExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIllegalUrlExportTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
