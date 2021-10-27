// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceUsageRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("StartDate")
    public String startDate;

    public static DescribeFaceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceUsageRequest self = new DescribeFaceUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaceUsageRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeFaceUsageRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
