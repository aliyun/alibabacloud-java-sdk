// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class AdvancePurgeObjectCacheShrinkRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    @NameInMap("Content")
    public String contentShrink;

    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("Stations")
    public String stations;

    @NameInMap("TimeRangeBegin")
    public Integer timeRangeBegin;

    @NameInMap("TimeRangeEnd")
    public Integer timeRangeEnd;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static AdvancePurgeObjectCacheShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AdvancePurgeObjectCacheShrinkRequest self = new AdvancePurgeObjectCacheShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AdvancePurgeObjectCacheShrinkRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public AdvancePurgeObjectCacheShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public AdvancePurgeObjectCacheShrinkRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public AdvancePurgeObjectCacheShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public AdvancePurgeObjectCacheShrinkRequest setStations(String stations) {
        this.stations = stations;
        return this;
    }
    public String getStations() {
        return this.stations;
    }

    public AdvancePurgeObjectCacheShrinkRequest setTimeRangeBegin(Integer timeRangeBegin) {
        this.timeRangeBegin = timeRangeBegin;
        return this;
    }
    public Integer getTimeRangeBegin() {
        return this.timeRangeBegin;
    }

    public AdvancePurgeObjectCacheShrinkRequest setTimeRangeEnd(Integer timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public Integer getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public AdvancePurgeObjectCacheShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
