// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeUserAlertCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-06-10</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>2025-05-12</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static DescribeUserAlertCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAlertCountRequest self = new DescribeUserAlertCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserAlertCountRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeUserAlertCountRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
