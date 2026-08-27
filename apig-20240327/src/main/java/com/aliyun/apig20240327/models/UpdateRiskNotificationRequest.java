// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateRiskNotificationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isMute")
    public Boolean isMute;

    /**
     * <strong>example:</strong>
     * <p>GW_VERSION_EXPIRED</p>
     */
    @NameInMap("riskCode")
    public String riskCode;

    public static UpdateRiskNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskNotificationRequest self = new UpdateRiskNotificationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRiskNotificationRequest setIsMute(Boolean isMute) {
        this.isMute = isMute;
        return this;
    }
    public Boolean getIsMute() {
        return this.isMute;
    }

    public UpdateRiskNotificationRequest setRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }
    public String getRiskCode() {
        return this.riskCode;
    }

}
