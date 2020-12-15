// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListDeviceGenderStatisticsRequest extends TeaModel {
    @NameInMap("DataSourceId")
    @Validation(required = true)
    public String dataSourceId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    public static ListDeviceGenderStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGenderStatisticsRequest self = new ListDeviceGenderStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceGenderStatisticsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListDeviceGenderStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListDeviceGenderStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListDeviceGenderStatisticsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
