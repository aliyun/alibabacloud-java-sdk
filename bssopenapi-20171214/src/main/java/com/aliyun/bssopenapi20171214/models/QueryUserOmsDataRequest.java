// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryUserOmsDataRequest extends TeaModel {
    @NameInMap("Table")
    @Validation(required = true)
    public String table;

    @NameInMap("DataType")
    @Validation(required = true)
    public String dataType;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryUserOmsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserOmsDataRequest self = new QueryUserOmsDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserOmsDataRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public QueryUserOmsDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryUserOmsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryUserOmsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryUserOmsDataRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public QueryUserOmsDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
