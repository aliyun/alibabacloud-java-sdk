// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class NearbySearchRequest extends TeaModel {
    /**
     * <p>搜索的关键词</p>
     */
    @NameInMap("keywords")
    public String keywords;

    /**
     * <p>搜索范围中心的纬度坐标。小数精度均不得超过六位</p>
     */
    @NameInMap("latitude")
    public String latitude;

    /**
     * <p>搜索范围中心的经度坐标。小数精度均不得超过六位</p>
     */
    @NameInMap("longitude")
    public String longitude;

    /**
     * <p>搜索的页数</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;total_count\&quot;: 6851, \&quot;page_number\&quot;: 54, \&quot;page_size\&quot;: 100}</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>搜索的范围，以米为单位。</p>
     */
    @NameInMap("radius")
    public Long radius;

    /**
     * <p>搜索结果每页所包含的结果数量</p>
     * 
     * <strong>example:</strong>
     * <p>812788</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>目标类型的枚举值，以 <code>|</code> 标记分隔</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;synonym\&quot;,\&quot;stopword\&quot;,\&quot;correction\&quot;,\&quot;ner\&quot;,\&quot;term_weighting\&quot;,\&quot;category_prediction\&quot;]</p>
     */
    @NameInMap("types")
    public String types;

    public static NearbySearchRequest build(java.util.Map<String, ?> map) throws Exception {
        NearbySearchRequest self = new NearbySearchRequest();
        return TeaModel.build(map, self);
    }

    public NearbySearchRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public NearbySearchRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public NearbySearchRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public NearbySearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public NearbySearchRequest setRadius(Long radius) {
        this.radius = radius;
        return this;
    }
    public Long getRadius() {
        return this.radius;
    }

    public NearbySearchRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public NearbySearchRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
