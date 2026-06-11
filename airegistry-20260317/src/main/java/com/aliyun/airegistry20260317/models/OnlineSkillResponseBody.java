// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class OnlineSkillResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnlineSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnlineSkillResponseBody self = new OnlineSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public OnlineSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
