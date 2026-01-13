// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class DownloadApiCallDailyDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>https://</p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>37A6ED15-DB44-50B5-B0DF-9449EED8FDF4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DownloadApiCallDailyDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadApiCallDailyDetailResponseBody self = new DownloadApiCallDailyDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadApiCallDailyDetailResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DownloadApiCallDailyDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
