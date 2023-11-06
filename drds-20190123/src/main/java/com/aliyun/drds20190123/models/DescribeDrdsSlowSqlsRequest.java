// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSlowSqlsRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The start time of the SQL query. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The SQL execution time. Unit: ms.</p>
     */
    @NameInMap("ExeTime")
    public Long exeTime;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The end time of the SQL query. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDrdsSlowSqlsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsSlowSqlsRequest self = new DescribeDrdsSlowSqlsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsSlowSqlsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDrdsSlowSqlsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsSlowSqlsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDrdsSlowSqlsRequest setExeTime(Long exeTime) {
        this.exeTime = exeTime;
        return this;
    }
    public Long getExeTime() {
        return this.exeTime;
    }

    public DescribeDrdsSlowSqlsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsSlowSqlsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsSlowSqlsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
