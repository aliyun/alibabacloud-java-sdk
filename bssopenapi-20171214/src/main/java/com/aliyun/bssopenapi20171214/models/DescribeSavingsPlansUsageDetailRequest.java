// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageDetailRequest extends TeaModel {
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

    public static DescribeSavingsPlansUsageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageDetailRequest self = new DescribeSavingsPlansUsageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageDetailRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansUsageDetailRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansUsageDetailRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSavingsPlansUsageDetailRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansUsageDetailRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public DescribeSavingsPlansUsageDetailRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
