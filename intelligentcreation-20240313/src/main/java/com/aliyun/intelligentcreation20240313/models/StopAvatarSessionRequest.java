// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StopAvatarSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>124900036</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>121dlsga4o7golrl1hojazg0u9lvysk0uyczgd79be2a4hkr9ijrblmb5qohi5iaja3p5j633doqj4t2uu3sek2i49hzkao0bli4bch4tnloyx22odd7sot9dxl5xfd0hbp7fl9dehnqofkb9csebf0nuezj8bwgec8ei6dby0encu5y88ky6oqensuqnj</p>
     */
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
