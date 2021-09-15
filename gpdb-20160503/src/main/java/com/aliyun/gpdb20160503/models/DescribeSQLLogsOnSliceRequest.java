// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsOnSliceRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("MaxExecuteCost")
    public String maxExecuteCost;

    @NameInMap("MinExecuteCost")
    public String minExecuteCost;

    @NameInMap("ExecuteState")
    public String executeState;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("QueryId")
    public String queryId;

    @NameInMap("SliceId")
    public String sliceId;

    public static DescribeSQLLogsOnSliceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsOnSliceRequest self = new DescribeSQLLogsOnSliceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsOnSliceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLLogsOnSliceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogsOnSliceRequest setMaxExecuteCost(String maxExecuteCost) {
        this.maxExecuteCost = maxExecuteCost;
        return this;
    }
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    public DescribeSQLLogsOnSliceRequest setMinExecuteCost(String minExecuteCost) {
        this.minExecuteCost = minExecuteCost;
        return this;
    }
    public String getMinExecuteCost() {
        return this.minExecuteCost;
    }

    public DescribeSQLLogsOnSliceRequest setExecuteState(String executeState) {
        this.executeState = executeState;
        return this;
    }
    public String getExecuteState() {
        return this.executeState;
    }

    public DescribeSQLLogsOnSliceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogsOnSliceRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeSQLLogsOnSliceRequest setSliceId(String sliceId) {
        this.sliceId = sliceId;
        return this;
    }
    public String getSliceId() {
        return this.sliceId;
    }

}
