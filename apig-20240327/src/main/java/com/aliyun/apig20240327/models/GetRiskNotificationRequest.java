// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetRiskNotificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GW_VERSION_EXPIRED</p>
     */
    @NameInMap("riskCode")
    public String riskCode;

    public static GetRiskNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskNotificationRequest self = new GetRiskNotificationRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskNotificationRequest setRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }
    public String getRiskCode() {
        return this.riskCode;
    }

}
