// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPopTrafficStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1681293719</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>1681035708</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListPopTrafficStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPopTrafficStatisticsRequest self = new ListPopTrafficStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListPopTrafficStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListPopTrafficStatisticsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListPopTrafficStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
