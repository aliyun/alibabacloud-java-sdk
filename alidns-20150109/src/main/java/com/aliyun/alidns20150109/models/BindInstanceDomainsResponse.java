// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class BindInstanceDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Integer successCount;

    @NameInMap("FailedCount")
    @Validation(required = true)
    public Integer failedCount;

    public static BindInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        BindInstanceDomainsResponse self = new BindInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

    public BindInstanceDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindInstanceDomainsResponse setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public BindInstanceDomainsResponse setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

}
