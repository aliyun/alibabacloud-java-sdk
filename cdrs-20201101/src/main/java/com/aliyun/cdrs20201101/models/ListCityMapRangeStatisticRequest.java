// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapRangeStatisticRequest extends TeaModel {
    @NameInMap("Radius")
    @Validation(required = true)
    public Integer radius;

    @NameInMap("Latitude")
    @Validation(required = true)
    public String latitude;

    @NameInMap("Longitude")
    @Validation(required = true)
    public String longitude;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    public static ListCityMapRangeStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapRangeStatisticRequest self = new ListCityMapRangeStatisticRequest();
        return TeaModel.build(map, self);
    }

    public ListCityMapRangeStatisticRequest setRadius(Integer radius) {
        this.radius = radius;
        return this;
    }
    public Integer getRadius() {
        return this.radius;
    }

    public ListCityMapRangeStatisticRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public ListCityMapRangeStatisticRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public ListCityMapRangeStatisticRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCityMapRangeStatisticRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCityMapRangeStatisticRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
