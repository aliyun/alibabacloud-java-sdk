// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallMeasureSummaryReportsRequest extends TeaModel {
    @NameInMap("IntervalType")
    public String intervalType;

    public static ListCallMeasureSummaryReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallMeasureSummaryReportsRequest self = new ListCallMeasureSummaryReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListCallMeasureSummaryReportsRequest setIntervalType(String intervalType) {
        this.intervalType = intervalType;
        return this;
    }
    public String getIntervalType() {
        return this.intervalType;
    }

}
