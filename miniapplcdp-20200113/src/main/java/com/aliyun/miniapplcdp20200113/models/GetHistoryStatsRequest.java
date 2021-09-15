// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetHistoryStatsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("StartDate")
    public String startDate;

    public static GetHistoryStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryStatsRequest self = new GetHistoryStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoryStatsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetHistoryStatsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetHistoryStatsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
