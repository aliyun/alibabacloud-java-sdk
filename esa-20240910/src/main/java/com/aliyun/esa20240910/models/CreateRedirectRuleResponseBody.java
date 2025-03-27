// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRedirectRuleResponseBody extends TeaModel {
    /**
     * <p>Configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1FCB0DA6-9B6D-509D-B91C-B9B9F0780D0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRedirectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRedirectRuleResponseBody self = new CreateRedirectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRedirectRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public CreateRedirectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
