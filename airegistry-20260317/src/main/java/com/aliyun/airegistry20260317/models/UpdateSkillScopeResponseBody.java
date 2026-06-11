// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillScopeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSkillScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillScopeResponseBody self = new UpdateSkillScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
