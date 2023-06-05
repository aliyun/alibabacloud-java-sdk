// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftSchedulesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of the page to return. Minimum value:1. Maximum value: 100. Default value: 1.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of your Alibaba Cloud account. You can log on to the DataWorks console and move the pointer over the profile picture in the upper-right corner to obtain the ID.</p>
     */
    @NameInMap("ShiftScheduleName")
    public String shiftScheduleName;

    public static ListShiftSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShiftSchedulesRequest self = new ListShiftSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public ListShiftSchedulesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListShiftSchedulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListShiftSchedulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListShiftSchedulesRequest setShiftScheduleName(String shiftScheduleName) {
        this.shiftScheduleName = shiftScheduleName;
        return this;
    }
    public String getShiftScheduleName() {
        return this.shiftScheduleName;
    }

}
