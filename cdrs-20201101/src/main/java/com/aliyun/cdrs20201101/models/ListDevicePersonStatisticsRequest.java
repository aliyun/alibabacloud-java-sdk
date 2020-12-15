// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListDevicePersonStatisticsRequest extends TeaModel {
    @NameInMap("DataSourceId")
    @Validation(required = true)
    public String dataSourceId;

    @NameInMap("StatisticsType")
    @Validation(required = true)
    public String statisticsType;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    public static ListDevicePersonStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicePersonStatisticsRequest self = new ListDevicePersonStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicePersonStatisticsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListDevicePersonStatisticsRequest setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
        return this;
    }
    public String getStatisticsType() {
        return this.statisticsType;
    }

    public ListDevicePersonStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListDevicePersonStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListDevicePersonStatisticsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
