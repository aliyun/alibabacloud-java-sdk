// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeathermonitorRequest extends TeaModel {
    // UserId
    @NameInMap("UserId")
    public Long userId;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 页面条数
    @NameInMap("PageSize")
    public Integer pageSize;

    // 气象实况时间 yyyymmddhh0000 （数据最小时间2021-08-16）（小时）	20210817120000
    @NameInMap("CurHour")
    public String curHour;

    // 页码
    @NameInMap("PageNum")
    public Integer pageNum;

    public static WeathermonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        WeathermonitorRequest self = new WeathermonitorRequest();
        return TeaModel.build(map, self);
    }

    public WeathermonitorRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public WeathermonitorRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WeathermonitorRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WeathermonitorRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public WeathermonitorRequest setCurHour(String curHour) {
        this.curHour = curHour;
        return this;
    }
    public String getCurHour() {
        return this.curHour;
    }

    public WeathermonitorRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

}
