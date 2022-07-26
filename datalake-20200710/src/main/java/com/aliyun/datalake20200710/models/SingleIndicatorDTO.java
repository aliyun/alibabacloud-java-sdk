// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SingleIndicatorDTO extends TeaModel {
    @NameInMap("DayIncrement")
    public Long dayIncrement;

    @NameInMap("DayOnDay")
    public Double dayOnDay;

    @NameInMap("MonthIncrement")
    public Long monthIncrement;

    @NameInMap("MonthOnMonth")
    public Double monthOnMonth;

    @NameInMap("Total")
    public Long total;

    public static SingleIndicatorDTO build(java.util.Map<String, ?> map) throws Exception {
        SingleIndicatorDTO self = new SingleIndicatorDTO();
        return TeaModel.build(map, self);
    }

    public SingleIndicatorDTO setDayIncrement(Long dayIncrement) {
        this.dayIncrement = dayIncrement;
        return this;
    }
    public Long getDayIncrement() {
        return this.dayIncrement;
    }

    public SingleIndicatorDTO setDayOnDay(Double dayOnDay) {
        this.dayOnDay = dayOnDay;
        return this;
    }
    public Double getDayOnDay() {
        return this.dayOnDay;
    }

    public SingleIndicatorDTO setMonthIncrement(Long monthIncrement) {
        this.monthIncrement = monthIncrement;
        return this;
    }
    public Long getMonthIncrement() {
        return this.monthIncrement;
    }

    public SingleIndicatorDTO setMonthOnMonth(Double monthOnMonth) {
        this.monthOnMonth = monthOnMonth;
        return this;
    }
    public Double getMonthOnMonth() {
        return this.monthOnMonth;
    }

    public SingleIndicatorDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
