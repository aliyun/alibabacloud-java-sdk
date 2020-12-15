// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapPersonFlowRequest extends TeaModel {
    @NameInMap("OriginDataSourceIdList")
    @Validation(required = true)
    public java.util.Map<String, ?> originDataSourceIdList;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TargetDataSourceIdList")
    @Validation(required = true)
    public java.util.Map<String, ?> targetDataSourceIdList;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("Range")
    @Validation(required = true)
    public String range;

    public static ListCityMapPersonFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapPersonFlowRequest self = new ListCityMapPersonFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListCityMapPersonFlowRequest setOriginDataSourceIdList(java.util.Map<String, ?> originDataSourceIdList) {
        this.originDataSourceIdList = originDataSourceIdList;
        return this;
    }
    public java.util.Map<String, ?> getOriginDataSourceIdList() {
        return this.originDataSourceIdList;
    }

    public ListCityMapPersonFlowRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCityMapPersonFlowRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCityMapPersonFlowRequest setTargetDataSourceIdList(java.util.Map<String, ?> targetDataSourceIdList) {
        this.targetDataSourceIdList = targetDataSourceIdList;
        return this;
    }
    public java.util.Map<String, ?> getTargetDataSourceIdList() {
        return this.targetDataSourceIdList;
    }

    public ListCityMapPersonFlowRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCityMapPersonFlowRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListCityMapPersonFlowRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

}
