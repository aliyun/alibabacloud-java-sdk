// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeathermonitorRequest extends TeaModel {
    // 气象实况时间 yyyymmddhh0000 （数据最小时间2021-08-16）（小时）	20210817120000
    @NameInMap("CurHour")
    public String curHour;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    // 页码
    @NameInMap("PageNum")
    public Integer pageNum;

    // 页面条数
    @NameInMap("PageSize")
    public Integer pageSize;

    public static WeathermonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        WeathermonitorRequest self = new WeathermonitorRequest();
        return TeaModel.build(map, self);
    }

    public WeathermonitorRequest setCurHour(String curHour) {
        this.curHour = curHour;
        return this;
    }
    public String getCurHour() {
        return this.curHour;
    }

    public WeathermonitorRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WeathermonitorRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public WeathermonitorRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
