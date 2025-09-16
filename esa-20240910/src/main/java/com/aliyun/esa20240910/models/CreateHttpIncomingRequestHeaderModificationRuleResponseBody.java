// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpIncomingRequestHeaderModificationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>7C414690-9D7B-5D66-9CD9-AD0B3F25ED49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHttpIncomingRequestHeaderModificationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpIncomingRequestHeaderModificationRuleResponseBody self = new CreateHttpIncomingRequestHeaderModificationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHttpIncomingRequestHeaderModificationRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public CreateHttpIncomingRequestHeaderModificationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
