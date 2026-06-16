// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class WindowLimit extends TeaModel {
    /**
     * <p>The duration of the time window in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("durationSecs")
    public Long durationSecs;

    /**
     * <p>The maximum requests allowed within the time window.</p>
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
