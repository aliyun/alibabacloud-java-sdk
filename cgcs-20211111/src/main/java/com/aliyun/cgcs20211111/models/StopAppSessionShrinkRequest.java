// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionShrinkRequest extends TeaModel {
    @NameInMap("CustomSessionId")
    public String customSessionId;

    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    /**
     * <p>停止容器参数。此参数将透传到Agent。</p>
     */
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
