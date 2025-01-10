// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class NearbySearchNovaRequest extends TeaModel {
    @NameInMap("cityLimit")
    public Boolean cityLimit;

    @NameInMap("keywords")
    public String keywords;

    /**
     * <strong>example:</strong>
     * <p>39.992873</p>
     */
    @NameInMap("latitude")
    public String latitude;

    /**
     * <strong>example:</strong>
     * <p>116.310918</p>
     */
    @NameInMap("longitude")
    public String longitude;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("radius")
    public Integer radius;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("size")
    public Integer size;

    @NameInMap("sortRule")
    public String sortRule;

    /**
     * <strong>example:</strong>
     * <p>GAS_STATION|RESTAURANT|HOTEL|ATTRACTION</p>
     */
    @NameInMap("types")
    public String types;

    public static NearbySearchNovaRequest build(java.util.Map<String, ?> map) throws Exception {
        NearbySearchNovaRequest self = new NearbySearchNovaRequest();
        return TeaModel.build(map, self);
    }

    public NearbySearchNovaRequest setCityLimit(Boolean cityLimit) {
        this.cityLimit = cityLimit;
        return this;
    }
    public Boolean getCityLimit() {
        return this.cityLimit;
    }

    public NearbySearchNovaRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public NearbySearchNovaRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public NearbySearchNovaRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public NearbySearchNovaRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public NearbySearchNovaRequest setRadius(Integer radius) {
        this.radius = radius;
        return this;
    }
    public Integer getRadius() {
        return this.radius;
    }

    public NearbySearchNovaRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public NearbySearchNovaRequest setSortRule(String sortRule) {
        this.sortRule = sortRule;
        return this;
    }
    public String getSortRule() {
        return this.sortRule;
    }

    public NearbySearchNovaRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
