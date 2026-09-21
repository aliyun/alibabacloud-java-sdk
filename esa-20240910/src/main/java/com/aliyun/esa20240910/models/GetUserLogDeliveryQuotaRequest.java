// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserLogDeliveryQuotaRequest extends TeaModel {
    /**
     * <p>The log type of real-time Mitigation Logs. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1 (default)</strong>: access logs.</li>
     * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
     * <li><strong>dcdn_log_waf</strong>: security protection logs.</li>
     * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration logs.</li>
     * <li><strong>dcdn_log_er_pod</strong>: edge container logs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    public static GetUserLogDeliveryQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserLogDeliveryQuotaRequest self = new GetUserLogDeliveryQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetUserLogDeliveryQuotaRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
