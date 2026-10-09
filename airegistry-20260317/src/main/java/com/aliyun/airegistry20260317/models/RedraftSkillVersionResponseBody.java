// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class RedraftSkillVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3920CB4B-90A2-5C97-80DA-578517F2C066</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RedraftSkillVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RedraftSkillVersionResponseBody self = new RedraftSkillVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public RedraftSkillVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
