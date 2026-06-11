// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreateSkillDraftResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSkillDraftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillDraftResponseBody self = new CreateSkillDraftResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillDraftResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateSkillDraftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
