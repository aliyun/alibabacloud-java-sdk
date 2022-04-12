// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionRequest extends TeaModel {
    // 自定义会话id
    @NameInMap("CustomSessionId")
    public String customSessionId;

    // 自定义用户id
    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    public static StopAppSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionRequest self = new StopAppSessionRequest();
        return TeaModel.build(map, self);
    }

    public StopAppSessionRequest setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public StopAppSessionRequest setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

}
