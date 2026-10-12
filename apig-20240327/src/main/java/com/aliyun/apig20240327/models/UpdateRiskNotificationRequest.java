// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateRiskNotificationRequest extends TeaModel {
    /**
     * <p>Specifies whether to mute notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isMute")
    public Boolean isMute;

    /**
     * <p>The risk item code. This parameter is required.</p>
     * <p>The value is a numeric string (for example, 60010010002 or 50010010009). Call GetRiskNotification to query the code of the current risk item.</p>
     * 
     * <strong>example:</strong>
     * <p>60010010002</p>
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
