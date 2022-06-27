// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsResponseBody extends TeaModel {
    @NameInMap("DownloadId")
    public String downloadId;

    @NameInMap("RequestId")
    public String requestId;

    public static DownloadDiagnosisRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadDiagnosisRecordsResponseBody self = new DownloadDiagnosisRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadDiagnosisRecordsResponseBody setDownloadId(String downloadId) {
        this.downloadId = downloadId;
        return this;
    }
    public String getDownloadId() {
        return this.downloadId;
    }

    public DownloadDiagnosisRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
