// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapCameraStatisticsRequest extends TeaModel {
    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("DataSourceIdList")
    @Validation(required = true)
    public String dataSourceIdList;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    public static ListCityMapCameraStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapCameraStatisticsRequest self = new ListCityMapCameraStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListCityMapCameraStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCityMapCameraStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListCityMapCameraStatisticsRequest setDataSourceIdList(String dataSourceIdList) {
        this.dataSourceIdList = dataSourceIdList;
        return this;
    }
    public String getDataSourceIdList() {
        return this.dataSourceIdList;
    }

    public ListCityMapCameraStatisticsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCityMapCameraStatisticsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

}
