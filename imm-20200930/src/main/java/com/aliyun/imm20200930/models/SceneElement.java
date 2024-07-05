// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SceneElement extends TeaModel {
    @NameInMap("FrameTimes")
    public java.util.List<Long> frameTimes;

    @NameInMap("TimeRange")
    public java.util.List<Long> timeRange;

    public static SceneElement build(java.util.Map<String, ?> map) throws Exception {
        SceneElement self = new SceneElement();
        return TeaModel.build(map, self);
    }

    public SceneElement setFrameTimes(java.util.List<Long> frameTimes) {
        this.frameTimes = frameTimes;
        return this;
    }
    public java.util.List<Long> getFrameTimes() {
        return this.frameTimes;
    }

    public SceneElement setTimeRange(java.util.List<Long> timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

}
