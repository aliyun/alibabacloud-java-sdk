// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertWarehouseQuotaResponseBody extends TeaModel {
    @NameInMap("AppTotalQuota")
    public Long appTotalQuota;

    @NameInMap("AppUseCount")
    public Long appUseCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total quota for certificate repositories, including the free quota and purchased quota.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("TotalQuota")
    public Long totalQuota;

    /**
     * <p>The used quota.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("UseCount")
    public Long useCount;

    public static GetCertWarehouseQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertWarehouseQuotaResponseBody self = new GetCertWarehouseQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertWarehouseQuotaResponseBody setAppTotalQuota(Long appTotalQuota) {
        this.appTotalQuota = appTotalQuota;
        return this;
    }
    public Long getAppTotalQuota() {
        return this.appTotalQuota;
    }

    public GetCertWarehouseQuotaResponseBody setAppUseCount(Long appUseCount) {
        this.appUseCount = appUseCount;
        return this;
    }
    public Long getAppUseCount() {
        return this.appUseCount;
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
