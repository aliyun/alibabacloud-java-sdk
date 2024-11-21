// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserLogDeliveryQuotaRequest extends TeaModel {
    /**
     * <p>The log category. Valid values:</p>
     * <ul>
     * <li>dcdn_log_access_l1 (default): access logs.</li>
     * <li>dcdn_log_er: Edge Routine logs.</li>
     * <li>dcdn_log_waf: firewall logs.</li>
     * <li>dcdn_log_ipa: TCP/UDP proxy logs.</li>
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
