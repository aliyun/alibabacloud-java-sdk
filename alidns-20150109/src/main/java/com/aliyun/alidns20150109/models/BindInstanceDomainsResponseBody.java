// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class BindInstanceDomainsResponseBody extends TeaModel {
    /**
     * <p>The number of domain names that failed to be bound to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedCount")
    public Integer failedCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of domain names that are bound to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    public static BindInstanceDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindInstanceDomainsResponseBody self = new BindInstanceDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public BindInstanceDomainsResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public BindInstanceDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindInstanceDomainsResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

}
