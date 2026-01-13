// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class DownloadMeteringDailyDetailResponseBody extends TeaModel {
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
     * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DownloadMeteringDailyDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadMeteringDailyDetailResponseBody self = new DownloadMeteringDailyDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadMeteringDailyDetailResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DownloadMeteringDailyDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
