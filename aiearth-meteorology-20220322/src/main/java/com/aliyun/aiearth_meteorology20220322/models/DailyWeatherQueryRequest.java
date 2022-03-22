// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class DailyWeatherQueryRequest extends TeaModel {
    // 要素
    @NameInMap("element")
    public String element;

    // 预报时间
    @NameInMap("forecastTimestamp")
    public String forecastTimestamp;

    // 纬度
    @NameInMap("latitude")
    public Double latitude;

    // 位置
    @NameInMap("location")
    public String location;

    // 经度
    @NameInMap("longitude")
    public Double longitude;

    // 产品代号
    @NameInMap("product")
    public String product;

    public static DailyWeatherQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DailyWeatherQueryRequest self = new DailyWeatherQueryRequest();
        return TeaModel.build(map, self);
    }

    public DailyWeatherQueryRequest setElement(String element) {
        this.element = element;
        return this;
    }
    public String getElement() {
        return this.element;
    }

    public DailyWeatherQueryRequest setForecastTimestamp(String forecastTimestamp) {
        this.forecastTimestamp = forecastTimestamp;
        return this;
    }
    public String getForecastTimestamp() {
        return this.forecastTimestamp;
    }

    public DailyWeatherQueryRequest setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }
    public Double getLatitude() {
        return this.latitude;
    }

    public DailyWeatherQueryRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DailyWeatherQueryRequest setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }
    public Double getLongitude() {
        return this.longitude;
    }

    public DailyWeatherQueryRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
