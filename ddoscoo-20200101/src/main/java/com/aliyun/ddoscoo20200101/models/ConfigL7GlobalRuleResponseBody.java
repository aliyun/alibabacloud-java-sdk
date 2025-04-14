// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7GlobalRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigL7GlobalRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7GlobalRuleResponseBody self = new ConfigL7GlobalRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigL7GlobalRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
