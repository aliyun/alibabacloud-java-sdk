// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class BindInstanceDomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailedCount")
    public Integer failedCount;

    @NameInMap("SuccessCount")
    public Integer successCount;

    public static BindInstanceDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindInstanceDomainsResponseBody self = new BindInstanceDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public BindInstanceDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindInstanceDomainsResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public BindInstanceDomainsResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

}
