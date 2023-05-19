// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageTotalRequest extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The time granularity at which coverage summary are queried. Valid values: MONTH, DAY, and HOUR.</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The ID of the account for which you want to query coverage summary. If you do not set this parameter, the data of the current Alibaba Cloud account and its RAM users is queried. To query the data of a RAM user, specify the ID of the RAM user.</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    public static DescribeSavingsPlansCoverageTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageTotalRequest self = new DescribeSavingsPlansCoverageTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageTotalRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansCoverageTotalRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansCoverageTotalRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansCoverageTotalRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

}
