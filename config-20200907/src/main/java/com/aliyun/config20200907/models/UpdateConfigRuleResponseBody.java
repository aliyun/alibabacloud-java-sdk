// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-a260626622af0005****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRuleResponseBody self = new UpdateConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRuleResponseBody setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public UpdateConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
