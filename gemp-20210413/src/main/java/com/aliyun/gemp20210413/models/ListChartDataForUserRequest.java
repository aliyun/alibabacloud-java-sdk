// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListChartDataForUserRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    // 结束时间
    @NameInMap("endTime")
    public String endTime;

    // 开始时间
    @NameInMap("startTime")
    public String startTime;

    public static ListChartDataForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChartDataForUserRequest self = new ListChartDataForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListChartDataForUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListChartDataForUserRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListChartDataForUserRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
