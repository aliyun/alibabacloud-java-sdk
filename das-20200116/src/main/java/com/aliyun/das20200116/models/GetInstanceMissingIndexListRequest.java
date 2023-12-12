// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceMissingIndexListRequest extends TeaModel {
    @NameInMap("AvgTotalUserCost")
    public String avgTotalUserCost;

    @NameInMap("AvgUserImpact")
    public String avgUserImpact;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IndexCount")
    public String indexCount;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ObjectName")
    public String objectName;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ReservedPages")
    public String reservedPages;

    @NameInMap("ReservedSize")
    public String reservedSize;

    @NameInMap("RowCount")
    public String rowCount;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("UniqueCompiles")
    public String uniqueCompiles;

    @NameInMap("UserScans")
    public String userScans;

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
