// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayQuotaRuleStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to clear historical quota usage when enabling or disabling the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("clearHistory")
    public Boolean clearHistory;

    /**
     * <p>Specifies whether to enable or disable the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    public static UpdateGatewayQuotaRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayQuotaRuleStatusRequest self = new UpdateGatewayQuotaRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayQuotaRuleStatusRequest setClearHistory(Boolean clearHistory) {
        this.clearHistory = clearHistory;
        return this;
    }
    public Boolean getClearHistory() {
        return this.clearHistory;
    }

    public UpdateGatewayQuotaRuleStatusRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
