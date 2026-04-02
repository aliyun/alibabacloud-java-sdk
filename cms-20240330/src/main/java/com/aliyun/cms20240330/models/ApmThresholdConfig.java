// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmThresholdConfig extends TeaModel {
    /**
     * <p>告警等级</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>阈值</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("threshold")
    public Float threshold;

    public static ApmThresholdConfig build(java.util.Map<String, ?> map) throws Exception {
        ApmThresholdConfig self = new ApmThresholdConfig();
        return TeaModel.build(map, self);
    }

    public ApmThresholdConfig setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ApmThresholdConfig setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
