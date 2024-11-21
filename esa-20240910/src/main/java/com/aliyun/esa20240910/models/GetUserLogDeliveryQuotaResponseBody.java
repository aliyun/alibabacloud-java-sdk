// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserLogDeliveryQuotaResponseBody extends TeaModel {
    /**
     * <p>The log category. Valid values:</p>
     * <ul>
     * <li>dcdn_log_access_l1 (default): access logs.</li>
     * <li>dcdn_log_er: Edge Routine logs.</li>
     * <li>dcdn_log_waf: firewall logs.</li>
     * <li>dcdn_log_ipa: TCP/UDP proxy logs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The remaining quota.</p>
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
