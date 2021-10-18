// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class StationDayRequest extends TeaModel {
    // UserId
    @NameInMap("UserId")
    public Long userId;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 气象预测开始时间
    @NameInMap("StartForecast")
    public String startForecast;

    // 全国站点（入参单一站点）
    @NameInMap("Station")
    public String station;

    public static StationDayRequest build(java.util.Map<String, ?> map) throws Exception {
        StationDayRequest self = new StationDayRequest();
        return TeaModel.build(map, self);
    }

    public StationDayRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public StationDayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public StationDayRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StationDayRequest setStartForecast(String startForecast) {
        this.startForecast = startForecast;
        return this;
    }
    public String getStartForecast() {
        return this.startForecast;
    }

    public StationDayRequest setStation(String station) {
        this.station = station;
        return this;
    }
    public String getStation() {
        return this.station;
    }

}
