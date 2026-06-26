// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class MoMValues extends TeaModel {
    /**
     * <p>The current value.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("currentValue")
    public Long currentValue;

    /**
     * <p>The value of the previous day.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("lastDayValue")
    public Long lastDayValue;

    /**
     * <p>The value of the previous month.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("lastMonthValue")
    public Long lastMonthValue;

    public static MoMValues build(java.util.Map<String, ?> map) throws Exception {
        MoMValues self = new MoMValues();
        return TeaModel.build(map, self);
    }

    public MoMValues setCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }
    public Long getCurrentValue() {
        return this.currentValue;
    }

    public MoMValues setLastDayValue(Long lastDayValue) {
        this.lastDayValue = lastDayValue;
        return this;
    }
    public Long getLastDayValue() {
        return this.lastDayValue;
    }

    public MoMValues setLastMonthValue(Long lastMonthValue) {
        this.lastMonthValue = lastMonthValue;
        return this;
    }
    public Long getLastMonthValue() {
        return this.lastMonthValue;
    }

}
