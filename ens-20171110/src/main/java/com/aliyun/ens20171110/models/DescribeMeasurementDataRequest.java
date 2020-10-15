// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMeasurementDataRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("StartDate")
    @Validation(required = true)
    public String startDate;

    @NameInMap("EndDate")
    @Validation(required = true)
    public String endDate;

    public static DescribeMeasurementDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeasurementDataRequest self = new DescribeMeasurementDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeasurementDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeMeasurementDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeMeasurementDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
