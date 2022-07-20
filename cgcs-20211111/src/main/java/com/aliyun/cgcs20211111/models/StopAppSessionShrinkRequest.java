// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionShrinkRequest extends TeaModel {
    // 自定义会话id
    @NameInMap("CustomSessionId")
    public String customSessionId;

    // 自定义用户id
    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    @NameInMap("StopParam")
    public String stopParamShrink;

    public static StopAppSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionShrinkRequest self = new StopAppSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopAppSessionShrinkRequest setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public StopAppSessionShrinkRequest setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public StopAppSessionShrinkRequest setStopParamShrink(String stopParamShrink) {
        this.stopParamShrink = stopParamShrink;
        return this;
    }
    public String getStopParamShrink() {
        return this.stopParamShrink;
    }

}
