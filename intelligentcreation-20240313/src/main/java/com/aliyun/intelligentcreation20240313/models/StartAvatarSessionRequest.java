// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StartAvatarSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13534711288320</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>15ED6083-B0B8-5B2A-BEDB-94A5C687C812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StartAvatarSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAvatarSessionRequest self = new StartAvatarSessionRequest();
        return TeaModel.build(map, self);
    }

    public StartAvatarSessionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StartAvatarSessionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
