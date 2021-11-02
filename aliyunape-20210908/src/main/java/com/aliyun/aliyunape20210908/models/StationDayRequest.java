// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class StationDayRequest extends TeaModel {
    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

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

    public StationDayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
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
