// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillBizTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSkillBizTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillBizTagsResponseBody self = new UpdateSkillBizTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillBizTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
