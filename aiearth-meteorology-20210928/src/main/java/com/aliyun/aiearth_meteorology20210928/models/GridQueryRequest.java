// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20210928.models;

import com.aliyun.tea.*;

public class GridQueryRequest extends TeaModel {
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

    // 分页编号
    @NameInMap("pageNo")
    public Integer pageNo;

    // 分页大小
    @NameInMap("pageSize")
    public Integer pageSize;

    // 产品
    @NameInMap("product")
    public String product;

    // 起报时间
    @NameInMap("reportTimestamp")
    public String reportTimestamp;

    public static GridQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        GridQueryRequest self = new GridQueryRequest();
        return TeaModel.build(map, self);
    }

    public GridQueryRequest setElement(String element) {
        this.element = element;
        return this;
    }
    public String getElement() {
        return this.element;
    }

    public GridQueryRequest setForecastTimestamp(String forecastTimestamp) {
        this.forecastTimestamp = forecastTimestamp;
        return this;
    }
    public String getForecastTimestamp() {
        return this.forecastTimestamp;
    }

    public GridQueryRequest setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }
    public Double getLatitude() {
        return this.latitude;
    }

    public GridQueryRequest setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }
    public Double getLongitude() {
        return this.longitude;
    }

    public GridQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GridQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GridQueryRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GridQueryRequest setReportTimestamp(String reportTimestamp) {
        this.reportTimestamp = reportTimestamp;
        return this;
    }
    public String getReportTimestamp() {
        return this.reportTimestamp;
    }

}
