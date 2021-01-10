// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryServiceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceStatus")
    public String serviceStatus;

    @NameInMap("Count")
    public Integer count;

    public static QueryServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceStatusResponseBody self = new QueryServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryServiceStatusResponseBody setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public QueryServiceStatusResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

}
