// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceMissingIndexListRequest extends TeaModel {
    /**
     * <p>The query condition based on the average cost savings.</p>
     */
    @NameInMap("AvgTotalUserCost")
    public String avgTotalUserCost;

    /**
     * <p>The query condition based on the performance improvement.</p>
     */
    @NameInMap("AvgUserImpact")
    public String avgUserImpact;

    /**
     * <p>The end time of the last seek.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The query condition based on the number of indexes.</p>
     */
    @NameInMap("IndexCount")
    public String indexCount;

    /**
     * <p>The database instance ID.</p>
     * <br>
     * <p>>  Only ApsaraDB RDS for SQL Server instances are supported.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The object name.</p>
     */
    @NameInMap("ObjectName")
    public String objectName;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The query condition based on the total number of pages.</p>
     */
    @NameInMap("ReservedPages")
    public String reservedPages;

    /**
     * <p>The query condition based on the table size.</p>
     */
    @NameInMap("ReservedSize")
    public String reservedSize;

    /**
     * <p>The query condition based on the number of table rows.</p>
     */
    @NameInMap("RowCount")
    public String rowCount;

    /**
     * <p>The start time of the last seek.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The query condition based on the number of compilations.</p>
     */
    @NameInMap("UniqueCompiles")
    public String uniqueCompiles;

    /**
     * <p>The query condition based on the number of scans.</p>
     */
    @NameInMap("UserScans")
    public String userScans;

    /**
     * <p>The query condition based on the number of seeks.</p>
     */
    @NameInMap("UserSeeks")
    public String userSeeks;

    public static GetInstanceMissingIndexListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMissingIndexListRequest self = new GetInstanceMissingIndexListRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceMissingIndexListRequest setAvgTotalUserCost(String avgTotalUserCost) {
        this.avgTotalUserCost = avgTotalUserCost;
        return this;
    }
    public String getAvgTotalUserCost() {
        return this.avgTotalUserCost;
    }

    public GetInstanceMissingIndexListRequest setAvgUserImpact(String avgUserImpact) {
        this.avgUserImpact = avgUserImpact;
        return this;
    }
    public String getAvgUserImpact() {
        return this.avgUserImpact;
    }

    public GetInstanceMissingIndexListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetInstanceMissingIndexListRequest setIndexCount(String indexCount) {
        this.indexCount = indexCount;
        return this;
    }
    public String getIndexCount() {
        return this.indexCount;
    }

    public GetInstanceMissingIndexListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceMissingIndexListRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public GetInstanceMissingIndexListRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetInstanceMissingIndexListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetInstanceMissingIndexListRequest setReservedPages(String reservedPages) {
        this.reservedPages = reservedPages;
        return this;
    }
    public String getReservedPages() {
        return this.reservedPages;
    }

    public GetInstanceMissingIndexListRequest setReservedSize(String reservedSize) {
        this.reservedSize = reservedSize;
        return this;
    }
    public String getReservedSize() {
        return this.reservedSize;
    }

    public GetInstanceMissingIndexListRequest setRowCount(String rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public String getRowCount() {
        return this.rowCount;
    }

    public GetInstanceMissingIndexListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetInstanceMissingIndexListRequest setUniqueCompiles(String uniqueCompiles) {
        this.uniqueCompiles = uniqueCompiles;
        return this;
    }
    public String getUniqueCompiles() {
        return this.uniqueCompiles;
    }

    public GetInstanceMissingIndexListRequest setUserScans(String userScans) {
        this.userScans = userScans;
        return this;
    }
    public String getUserScans() {
        return this.userScans;
    }

    public GetInstanceMissingIndexListRequest setUserSeeks(String userSeeks) {
        this.userSeeks = userSeeks;
        return this;
    }
    public String getUserSeeks() {
        return this.userSeeks;
    }

}
