// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMeasurementDataRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Version")
    public String version;

    public static DescribeMeasurementDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeasurementDataRequest self = new DescribeMeasurementDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeasurementDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeMeasurementDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeMeasurementDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
