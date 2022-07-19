// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftSchedulesRequest extends TeaModel {
    @NameInMap("Owner")
    public String owner;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

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
