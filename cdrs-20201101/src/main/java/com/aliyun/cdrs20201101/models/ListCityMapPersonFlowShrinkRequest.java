// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapPersonFlowShrinkRequest extends TeaModel {
    @NameInMap("OriginDataSourceIdList")
    @Validation(required = true)
    public String originDataSourceIdListShrink;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TargetDataSourceIdList")
    @Validation(required = true)
    public String targetDataSourceIdListShrink;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("Range")
    @Validation(required = true)
    public String range;

    public static ListCityMapPersonFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapPersonFlowShrinkRequest self = new ListCityMapPersonFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCityMapPersonFlowShrinkRequest setOriginDataSourceIdListShrink(String originDataSourceIdListShrink) {
        this.originDataSourceIdListShrink = originDataSourceIdListShrink;
        return this;
    }
    public String getOriginDataSourceIdListShrink() {
        return this.originDataSourceIdListShrink;
    }

    public ListCityMapPersonFlowShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCityMapPersonFlowShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCityMapPersonFlowShrinkRequest setTargetDataSourceIdListShrink(String targetDataSourceIdListShrink) {
        this.targetDataSourceIdListShrink = targetDataSourceIdListShrink;
        return this;
    }
    public String getTargetDataSourceIdListShrink() {
        return this.targetDataSourceIdListShrink;
    }

    public ListCityMapPersonFlowShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCityMapPersonFlowShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListCityMapPersonFlowShrinkRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

}
