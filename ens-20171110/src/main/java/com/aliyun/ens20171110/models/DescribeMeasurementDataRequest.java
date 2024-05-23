// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMeasurementDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

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

}
