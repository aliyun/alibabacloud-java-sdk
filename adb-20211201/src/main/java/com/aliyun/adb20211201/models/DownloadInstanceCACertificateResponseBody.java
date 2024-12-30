// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DownloadInstanceCACertificateResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <strong>example:</strong>
     * <p>9CCFAAB4-97B7-5800-B9F2-685EB596E3EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DownloadInstanceCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadInstanceCACertificateResponseBody self = new DownloadInstanceCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadInstanceCACertificateResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DownloadInstanceCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
