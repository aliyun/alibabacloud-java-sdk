// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class MoMValues extends TeaModel {
    /**
     * <p>total</p>
     */
    @NameInMap("currentValue")
    public Long currentValue;

    /**
     * <p>daily addition</p>
     */
    @NameInMap("lastDayValue")
    public Long lastDayValue;

    /**
     * <p>monthly addition</p>
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
