// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CheckRawPlanJsonRequest extends TeaModel {
    @NameInMap("sessionId")
    public String sessionId;

    public static CheckRawPlanJsonRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRawPlanJsonRequest self = new CheckRawPlanJsonRequest();
        return TeaModel.build(map, self);
    }

    public CheckRawPlanJsonRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
