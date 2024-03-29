// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionLogRequest extends TeaModel {
    @NameInMap("FromDate")
    public Long fromDate;

    @NameInMap("LogRequestId")
    public String logRequestId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("Status")
    public String status;

    @NameInMap("ToDate")
    public Long toDate;

    public static ListFunctionLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionLogRequest self = new ListFunctionLogRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionLogRequest setFromDate(Long fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    public Long getFromDate() {
        return this.fromDate;
    }

    public ListFunctionLogRequest setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
        return this;
    }
    public String getLogRequestId() {
        return this.logRequestId;
    }

    public ListFunctionLogRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListFunctionLogRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListFunctionLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFunctionLogRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public ListFunctionLogRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFunctionLogRequest setToDate(Long toDate) {
        this.toDate = toDate;
        return this;
    }
    public Long getToDate() {
        return this.toDate;
    }

}
