// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomResponseCodeRuleResponseBody extends TeaModel {
    /**
     * <p>The configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C2B2F8CF-3074-5BBC-891A-AAD292E2624F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomResponseCodeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomResponseCodeRuleResponseBody self = new CreateCustomResponseCodeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomResponseCodeRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public CreateCustomResponseCodeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
