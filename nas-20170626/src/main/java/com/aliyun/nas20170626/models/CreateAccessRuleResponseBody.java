// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccessRuleId")
    public String accessRuleId;

    public static CreateAccessRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessRuleResponseBody self = new CreateAccessRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccessRuleResponseBody setAccessRuleId(String accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

}
