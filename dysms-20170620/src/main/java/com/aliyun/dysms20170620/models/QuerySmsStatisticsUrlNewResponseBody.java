// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsUrlNewResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySmsStatisticsUrlNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsUrlNewResponseBody self = new QuerySmsStatisticsUrlNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsUrlNewResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public QuerySmsStatisticsUrlNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
