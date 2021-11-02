// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class HistoricalRequest extends TeaModel {
    // endTime
    @NameInMap("EndTime")
    public String endTime;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    // pageNum
    @NameInMap("PageNum")
    public Integer pageNum;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // startTime
    @NameInMap("StartTime")
    public String startTime;

    // 全国（入参单一站点）
    @NameInMap("Station")
    public String station;

    public static HistoricalRequest build(java.util.Map<String, ?> map) throws Exception {
        HistoricalRequest self = new HistoricalRequest();
        return TeaModel.build(map, self);
    }

    public HistoricalRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public HistoricalRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public HistoricalRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public HistoricalRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HistoricalRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public HistoricalRequest setStation(String station) {
        this.station = station;
        return this;
    }
    public String getStation() {
        return this.station;
    }

}
