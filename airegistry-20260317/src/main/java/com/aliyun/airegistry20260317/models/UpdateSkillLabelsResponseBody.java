// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillLabelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSkillLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillLabelsResponseBody self = new UpdateSkillLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
