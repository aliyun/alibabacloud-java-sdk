// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSendFailDetailsUrlNewResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static QuerySmsSendFailDetailsUrlNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSendFailDetailsUrlNewResponseBody self = new QuerySmsSendFailDetailsUrlNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSendFailDetailsUrlNewResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public QuerySmsSendFailDetailsUrlNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsSendFailDetailsUrlNewResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
