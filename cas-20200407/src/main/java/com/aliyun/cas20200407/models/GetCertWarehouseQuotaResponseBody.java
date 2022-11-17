// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertWarehouseQuotaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalQuota")
    public Long totalQuota;

    @NameInMap("UseCount")
    public Long useCount;

    public static GetCertWarehouseQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertWarehouseQuotaResponseBody self = new GetCertWarehouseQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertWarehouseQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCertWarehouseQuotaResponseBody setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    public GetCertWarehouseQuotaResponseBody setUseCount(Long useCount) {
        this.useCount = useCount;
        return this;
    }
    public Long getUseCount() {
        return this.useCount;
    }

}
