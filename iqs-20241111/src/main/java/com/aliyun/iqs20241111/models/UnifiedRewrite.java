// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedRewrite extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("timeRange")
    public String timeRange;

    public static UnifiedRewrite build(java.util.Map<String, ?> map) throws Exception {
        UnifiedRewrite self = new UnifiedRewrite();
        return TeaModel.build(map, self);
    }

    public UnifiedRewrite setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UnifiedRewrite setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
