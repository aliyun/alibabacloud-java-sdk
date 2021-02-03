// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UnbindInstanceDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Integer successCount;

    @NameInMap("FailedCount")
    @Validation(required = true)
    public Integer failedCount;

    public static UnbindInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstanceDomainsResponse self = new UnbindInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

    public UnbindInstanceDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindInstanceDomainsResponse setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public UnbindInstanceDomainsResponse setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

}
