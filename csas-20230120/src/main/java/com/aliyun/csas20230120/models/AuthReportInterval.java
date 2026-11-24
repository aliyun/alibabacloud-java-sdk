// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AuthReportInterval extends TeaModel {
    /**
     * <p>The unit of the effective recovery duration. Valid values:</p>
     * <ul>
     * <li><strong>Minute</strong>: Minutes.</li>
     * <li><strong>Hour</strong>: Hours.</li>
     * <li><strong>Day</strong>: Days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Minute</p>
     */
    @NameInMap("TimeUnit")
    public String timeUnit;

    /**
     * <p>The numeric value of the effective recovery duration. The unit is specified by TimeUnit. A non-zero value must be at least 1.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Value")
    public Long value;

    public static AuthReportInterval build(java.util.Map<String, ?> map) throws Exception {
        AuthReportInterval self = new AuthReportInterval();
        return TeaModel.build(map, self);
    }

    public AuthReportInterval setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public AuthReportInterval setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
