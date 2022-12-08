// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryCarProcessEventsRequest extends TeaModel {
    @NameInMap("ActionType")
    public Integer actionType;

    @NameInMap("AreaIndex")
    public Integer areaIndex;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlateNo")
    public String plateNo;

    @NameInMap("SubDeviceName")
    public String subDeviceName;

    @NameInMap("SubIotId")
    public String subIotId;

    @NameInMap("SubProductKey")
    public String subProductKey;

    public static QueryCarProcessEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarProcessEventsRequest self = new QueryCarProcessEventsRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarProcessEventsRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public QueryCarProcessEventsRequest setAreaIndex(Integer areaIndex) {
        this.areaIndex = areaIndex;
        return this;
    }
    public Integer getAreaIndex() {
        return this.areaIndex;
    }

    public QueryCarProcessEventsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryCarProcessEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryCarProcessEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryCarProcessEventsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryCarProcessEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCarProcessEventsRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public QueryCarProcessEventsRequest setSubDeviceName(String subDeviceName) {
        this.subDeviceName = subDeviceName;
        return this;
    }
    public String getSubDeviceName() {
        return this.subDeviceName;
    }

    public QueryCarProcessEventsRequest setSubIotId(String subIotId) {
        this.subIotId = subIotId;
        return this;
    }
    public String getSubIotId() {
        return this.subIotId;
    }

    public QueryCarProcessEventsRequest setSubProductKey(String subProductKey) {
        this.subProductKey = subProductKey;
        return this;
    }
    public String getSubProductKey() {
        return this.subProductKey;
    }

}
