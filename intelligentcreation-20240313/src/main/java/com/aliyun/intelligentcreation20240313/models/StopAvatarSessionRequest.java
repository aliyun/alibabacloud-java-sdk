// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StopAvatarSessionRequest extends TeaModel {
    @NameInMap("projectId")
    public String projectId;

    @NameInMap("sessionId")
    public String sessionId;

    public static StopAvatarSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAvatarSessionRequest self = new StopAvatarSessionRequest();
        return TeaModel.build(map, self);
    }

    public StopAvatarSessionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StopAvatarSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
