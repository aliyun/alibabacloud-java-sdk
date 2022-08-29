// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSnapshotUrlsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotUrls")
    public java.util.List<String> snapshotUrls;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("WebVTTUrl")
    public String webVTTUrl;

    public static GetSnapshotUrlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotUrlsResponseBody self = new GetSnapshotUrlsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotUrlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSnapshotUrlsResponseBody setSnapshotUrls(java.util.List<String> snapshotUrls) {
        this.snapshotUrls = snapshotUrls;
        return this;
    }
    public java.util.List<String> getSnapshotUrls() {
        return this.snapshotUrls;
    }

    public GetSnapshotUrlsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetSnapshotUrlsResponseBody setWebVTTUrl(String webVTTUrl) {
        this.webVTTUrl = webVTTUrl;
        return this;
    }
    public String getWebVTTUrl() {
        return this.webVTTUrl;
    }

}
