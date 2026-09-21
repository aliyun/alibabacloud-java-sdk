// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserLogDeliveryQuotaResponseBody extends TeaModel {
    /**
     * <p>The log type of real-time Mitigation Logs. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1 (default)</strong>: access logs.</li>
     * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
     * <li><strong>dcdn_log_waf</strong>: security protection logs.</li>
     * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration logs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The remaining available quota.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FreeQuota")
    public Long freeQuota;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserLogDeliveryQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserLogDeliveryQuotaResponseBody self = new GetUserLogDeliveryQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserLogDeliveryQuotaResponseBody setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetUserLogDeliveryQuotaResponseBody setFreeQuota(Long freeQuota) {
        this.freeQuota = freeQuota;
        return this;
    }
    public Long getFreeQuota() {
        return this.freeQuota;
    }

    public GetUserLogDeliveryQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
