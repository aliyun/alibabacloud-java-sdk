// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the download task.</p>
     */
    @NameInMap("DownloadId")
    public String downloadId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DownloadDiagnosisRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadDiagnosisRecordsResponseBody self = new DownloadDiagnosisRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadDiagnosisRecordsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
