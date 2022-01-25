// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListRecordResultsRequest extends TeaModel {
    // yyyy-MM-dd
    @NameInMap("CreateDateFrom")
    public String createDateFrom;

    // yyyy-MM-dd
    @NameInMap("CreateDateTo")
    public String createDateTo;

    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("Type")
    public String type;

    public static ListRecordResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecordResultsRequest self = new ListRecordResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecordResultsRequest setCreateDateFrom(String createDateFrom) {
        this.createDateFrom = createDateFrom;
        return this;
    }
    public String getCreateDateFrom() {
        return this.createDateFrom;
    }

    public ListRecordResultsRequest setCreateDateTo(String createDateTo) {
        this.createDateTo = createDateTo;
        return this;
    }
    public String getCreateDateTo() {
        return this.createDateTo;
    }

    public ListRecordResultsRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public ListRecordResultsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListRecordResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecordResultsRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public ListRecordResultsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
