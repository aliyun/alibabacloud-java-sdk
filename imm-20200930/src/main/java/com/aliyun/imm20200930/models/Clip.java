// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Clip extends TeaModel {
    @NameInMap("TimeRange")
    public java.util.List<Long> timeRange;

    public static Clip build(java.util.Map<String, ?> map) throws Exception {
        Clip self = new Clip();
        return TeaModel.build(map, self);
    }

    public Clip setTimeRange(java.util.List<Long> timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

}
