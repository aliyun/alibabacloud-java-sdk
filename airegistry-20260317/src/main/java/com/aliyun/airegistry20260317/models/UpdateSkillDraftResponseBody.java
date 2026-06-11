// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillDraftResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSkillDraftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillDraftResponseBody self = new UpdateSkillDraftResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillDraftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
