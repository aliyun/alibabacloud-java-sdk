// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryUserNoticeStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public Boolean status;

    public static QueryUserNoticeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserNoticeStatusResponse self = new QueryUserNoticeStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserNoticeStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserNoticeStatusResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
