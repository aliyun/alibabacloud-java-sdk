// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnMeasurementDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-30T16:00:00Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-mm-ddthh:mm:ssz format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-30T16:00:00Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static DescribeEpnMeasurementDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnMeasurementDataRequest self = new DescribeEpnMeasurementDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEpnMeasurementDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeEpnMeasurementDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
