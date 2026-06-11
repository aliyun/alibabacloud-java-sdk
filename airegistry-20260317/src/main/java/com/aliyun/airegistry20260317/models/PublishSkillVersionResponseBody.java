// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class PublishSkillVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishSkillVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishSkillVersionResponseBody self = new PublishSkillVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishSkillVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
