// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportMeasurementDataRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Version")
    public String version;

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

    public ExportMeasurementDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
