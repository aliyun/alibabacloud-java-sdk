// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class WindowLimit extends TeaModel {
    /**
     * <p>限流时间窗口的持续时间，单位为秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("durationSecs")
    public Long durationSecs;

    /**
     * <p>在指定时间窗口内允许的最大请求数量</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Long limit;

    public static WindowLimit build(java.util.Map<String, ?> map) throws Exception {
        WindowLimit self = new WindowLimit();
        return TeaModel.build(map, self);
    }

    public WindowLimit setDurationSecs(Long durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }
    public Long getDurationSecs() {
        return this.durationSecs;
    }

    public WindowLimit setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
