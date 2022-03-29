// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportMeasurementDataRequest extends TeaModel {
    // 结束时间，UTC格式
    @NameInMap("EndDate")
    public String endDate;

    // 开始时间，UTC格式
    @NameInMap("StartDate")
    public String startDate;

    public static ExportMeasurementDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportMeasurementDataRequest self = new ExportMeasurementDataRequest();
        return TeaModel.build(map, self);
    }

    public ExportMeasurementDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportMeasurementDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
