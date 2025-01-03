// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
     */
    @NameInMap("AccessRuleId")
    public String accessRuleId;

    /**
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessRuleResponseBody self = new CreateAccessRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessRuleResponseBody setAccessRuleId(String accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    public CreateAccessRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
