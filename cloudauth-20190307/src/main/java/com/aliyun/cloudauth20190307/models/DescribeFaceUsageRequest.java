// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceUsageRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    public static DescribeFaceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceUsageRequest self = new DescribeFaceUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaceUsageRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeFaceUsageRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeFaceUsageRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
