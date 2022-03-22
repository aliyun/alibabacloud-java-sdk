// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class GridWeatherQueryRequest extends TeaModel {
    // 要素
    @NameInMap("element")
    public String element;

    // 预报时间
    @NameInMap("forecastTimestamp")
    public String forecastTimestamp;

    // 纬度
    @NameInMap("latitude")
    public Double latitude;

    // 经度
    @NameInMap("longitude")
    public Double longitude;

    // 观测时间
    @NameInMap("observationTimestamp")
    public String observationTimestamp;

    // 产品代号
    @NameInMap("product")
    public String product;

    // 起报时间
    @NameInMap("reportTimestamp")
    public String reportTimestamp;

    public static GridWeatherQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        GridWeatherQueryRequest self = new GridWeatherQueryRequest();
        return TeaModel.build(map, self);
    }

    public GridWeatherQueryRequest setElement(String element) {
        this.element = element;
        return this;
    }
    public String getElement() {
        return this.element;
    }

    public GridWeatherQueryRequest setForecastTimestamp(String forecastTimestamp) {
        this.forecastTimestamp = forecastTimestamp;
        return this;
    }
    public String getForecastTimestamp() {
        return this.forecastTimestamp;
    }

    public GridWeatherQueryRequest setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }
    public Double getLatitude() {
        return this.latitude;
    }

    public GridWeatherQueryRequest setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }
    public Double getLongitude() {
        return this.longitude;
    }

    public GridWeatherQueryRequest setObservationTimestamp(String observationTimestamp) {
        this.observationTimestamp = observationTimestamp;
        return this;
    }
    public String getObservationTimestamp() {
        return this.observationTimestamp;
    }

    public GridWeatherQueryRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GridWeatherQueryRequest setReportTimestamp(String reportTimestamp) {
        this.reportTimestamp = reportTimestamp;
        return this;
    }
    public String getReportTimestamp() {
        return this.reportTimestamp;
    }

}
