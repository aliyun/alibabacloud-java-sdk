// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ForcePublishSkillVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ForcePublishSkillVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ForcePublishSkillVersionResponseBody self = new ForcePublishSkillVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ForcePublishSkillVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
