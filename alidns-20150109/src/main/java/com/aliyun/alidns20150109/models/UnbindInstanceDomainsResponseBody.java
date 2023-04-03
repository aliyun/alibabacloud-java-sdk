// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UnbindInstanceDomainsResponseBody extends TeaModel {
    /**
     * <p>The number of domain names that failed to be unbound.</p>
     */
    @NameInMap("FailedCount")
    public Integer failedCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of domain names that have been unbound.</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    public static UnbindInstanceDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstanceDomainsResponseBody self = new UnbindInstanceDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindInstanceDomainsResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public UnbindInstanceDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindInstanceDomainsResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

}
