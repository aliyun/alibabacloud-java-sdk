// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetIndicatorDetailsRequest extends TeaModel {
    @NameInMap("dateRange")
    public String dateRange;

    @NameInMap("indicatorCodeList")
    public java.util.List<String> indicatorCodeList;

    @NameInMap("timeUnit")
    public String timeUnit;

    public static GetIndicatorDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndicatorDetailsRequest self = new GetIndicatorDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetIndicatorDetailsRequest setDateRange(String dateRange) {
        this.dateRange = dateRange;
        return this;
    }
    public String getDateRange() {
        return this.dateRange;
    }

    public GetIndicatorDetailsRequest setIndicatorCodeList(java.util.List<String> indicatorCodeList) {
        this.indicatorCodeList = indicatorCodeList;
        return this;
    }
    public java.util.List<String> getIndicatorCodeList() {
        return this.indicatorCodeList;
    }

    public GetIndicatorDetailsRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

}
