// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageTotalShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the resource ownership account. The resource ownership account is the account that actually uses the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>123745698925000</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>Format: yyyy-MM-dd HH:mm:ss. The query excludes this time. If this parameter is left empty, the query covers data up to the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-20 00:00:00</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    @NameInMap("FilterParam")
    public String filterParamShrink;

    /**
     * <p>Valid values:</p>
     * <ul>
     * <li>MONTH: month granularity.</li>
     * <li>DAY: day granularity.</li>
     * <li>HOUR: hour granularity.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>Format: yyyy-MM-dd HH:mm:ss. The query includes this time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-15 00:00:00</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    public static DescribeSavingsPlansCoverageTotalShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageTotalShrinkRequest self = new DescribeSavingsPlansCoverageTotalShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageTotalShrinkRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansCoverageTotalShrinkRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansCoverageTotalShrinkRequest setFilterParamShrink(String filterParamShrink) {
        this.filterParamShrink = filterParamShrink;
        return this;
    }
    public String getFilterParamShrink() {
        return this.filterParamShrink;
    }

    public DescribeSavingsPlansCoverageTotalShrinkRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansCoverageTotalShrinkRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

}
