// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageDetailRequest extends TeaModel {
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    @NameInMap("EndPeriod")
    public String endPeriod;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("PeriodType")
    public String periodType;

    @NameInMap("StartPeriod")
    public String startPeriod;

    @NameInMap("Token")
    public String token;

    public static DescribeSavingsPlansCoverageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageDetailRequest self = new DescribeSavingsPlansCoverageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageDetailRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansCoverageDetailRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansCoverageDetailRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSavingsPlansCoverageDetailRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansCoverageDetailRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public DescribeSavingsPlansCoverageDetailRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
