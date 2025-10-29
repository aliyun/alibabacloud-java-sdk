// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetValidationQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalQuota")
    public Integer totalQuota;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedQuota")
    public Integer usedQuota;

    public static GetValidationQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetValidationQuotaResponseBody self = new GetValidationQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetValidationQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetValidationQuotaResponseBody setTotalQuota(Integer totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Integer getTotalQuota() {
        return this.totalQuota;
    }

    public GetValidationQuotaResponseBody setUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public Integer getUsedQuota() {
        return this.usedQuota;
    }

}
