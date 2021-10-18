// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class HistoricalRequest extends TeaModel {
    // UserId
    @NameInMap("UserId")
    public Long userId;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // station全国（入参单一站点）
    @NameInMap("Station")
    public String station;

    // pageSize是	页面条数
    @NameInMap("PageSize")
    public Integer pageSize;

    // startTimeyyyymmddhh0000（当startTime为空时无数据产出，确认是否入参）
    @NameInMap("StartTime")
    public Integer startTime;

    // endTimeyyyymmddhh0000 （当endTime为空时无数据产出，确认是否入参）
    @NameInMap("EndTime")
    public Integer endTime;

    // pageNum页码数
    @NameInMap("PageNum")
    public Integer pageNum;

    public static HistoricalRequest build(java.util.Map<String, ?> map) throws Exception {
        HistoricalRequest self = new HistoricalRequest();
        return TeaModel.build(map, self);
    }

    public HistoricalRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public HistoricalRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public HistoricalRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HistoricalRequest setStation(String station) {
        this.station = station;
        return this;
    }
    public String getStation() {
        return this.station;
    }

    public HistoricalRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HistoricalRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public HistoricalRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public HistoricalRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

}
