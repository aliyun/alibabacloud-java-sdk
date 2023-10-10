// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class PhaseStatisticItem extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("durationAvg")
    public Double durationAvg;

    @NameInMap("durationMax")
    public Double durationMax;

    @NameInMap("durationTotal")
    public Double durationTotal;

    @NameInMap("intervalAvg")
    public Double intervalAvg;

    @NameInMap("intervalMin")
    public Double intervalMin;

    @NameInMap("name")
    public String name;

    public static PhaseStatisticItem build(java.util.Map<String, ?> map) throws Exception {
        PhaseStatisticItem self = new PhaseStatisticItem();
        return TeaModel.build(map, self);
    }

    public PhaseStatisticItem setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public PhaseStatisticItem setDurationAvg(Double durationAvg) {
        this.durationAvg = durationAvg;
        return this;
    }
    public Double getDurationAvg() {
        return this.durationAvg;
    }

    public PhaseStatisticItem setDurationMax(Double durationMax) {
        this.durationMax = durationMax;
        return this;
    }
    public Double getDurationMax() {
        return this.durationMax;
    }

    public PhaseStatisticItem setDurationTotal(Double durationTotal) {
        this.durationTotal = durationTotal;
        return this;
    }
    public Double getDurationTotal() {
        return this.durationTotal;
    }

    public PhaseStatisticItem setIntervalAvg(Double intervalAvg) {
        this.intervalAvg = intervalAvg;
        return this;
    }
    public Double getIntervalAvg() {
        return this.intervalAvg;
    }

    public PhaseStatisticItem setIntervalMin(Double intervalMin) {
        this.intervalMin = intervalMin;
        return this;
    }
    public Double getIntervalMin() {
        return this.intervalMin;
    }

    public PhaseStatisticItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
