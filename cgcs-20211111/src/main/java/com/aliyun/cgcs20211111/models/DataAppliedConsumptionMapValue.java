// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DataAppliedConsumptionMapValue extends TeaModel {
    // 应用ID
    @NameInMap("AppliedId")
    public String appliedId;

    // 统计日期
    @NameInMap("StatDate")
    public String statDate;

    // 分钟级消耗CU
    @NameInMap("ConsumptionCu")
    public Long consumptionCu;

    public static DataAppliedConsumptionMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataAppliedConsumptionMapValue self = new DataAppliedConsumptionMapValue();
        return TeaModel.build(map, self);
    }

    public DataAppliedConsumptionMapValue setAppliedId(String appliedId) {
        this.appliedId = appliedId;
        return this;
    }
    public String getAppliedId() {
        return this.appliedId;
    }

    public DataAppliedConsumptionMapValue setStatDate(String statDate) {
        this.statDate = statDate;
        return this;
    }
    public String getStatDate() {
        return this.statDate;
    }

    public DataAppliedConsumptionMapValue setConsumptionCu(Long consumptionCu) {
        this.consumptionCu = consumptionCu;
        return this;
    }
    public Long getConsumptionCu() {
        return this.consumptionCu;
    }

}
