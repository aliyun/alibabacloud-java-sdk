// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class DeleteSkillResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillResponseBody self = new DeleteSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
