// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CheckSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>121dlsga4o7golrl1hoja</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static CheckSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSessionRequest self = new CheckSessionRequest();
        return TeaModel.build(map, self);
    }

    public CheckSessionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CheckSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
