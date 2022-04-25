// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class IndicatorStatistic extends TeaModel {
    // 指标数据
    @NameInMap("Data")
    public Long data;

    // 指标日期
    @NameInMap("Date")
    public String date;

    public static IndicatorStatistic build(java.util.Map<String, ?> map) throws Exception {
        IndicatorStatistic self = new IndicatorStatistic();
        return TeaModel.build(map, self);
    }

    public IndicatorStatistic setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public IndicatorStatistic setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
