// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportMeasurementDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-mm-ddthh:mm:ssz format. The time must be in UTC.</p>
     */
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
