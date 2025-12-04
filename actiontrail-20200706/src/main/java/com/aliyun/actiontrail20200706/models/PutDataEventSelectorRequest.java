// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class PutDataEventSelectorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]},&quot;ReadWriteType&quot;:&quot;All&quot;,&quot;ServiceName&quot;:&quot;Oss&quot;}]</p>
     */
    @NameInMap("EventSelectors")
    public String eventSelectors;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTrailAllRegion")
    public Boolean isTrailAllRegion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-name</p>
     */
    @NameInMap("TrailName")
    public String trailName;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai,cn-hangzhou</p>
     */
    @NameInMap("TrailRegionIds")
    public String trailRegionIds;

    public static PutDataEventSelectorRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDataEventSelectorRequest self = new PutDataEventSelectorRequest();
        return TeaModel.build(map, self);
    }

    public PutDataEventSelectorRequest setEventSelectors(String eventSelectors) {
        this.eventSelectors = eventSelectors;
        return this;
    }
    public String getEventSelectors() {
        return this.eventSelectors;
    }

    public PutDataEventSelectorRequest setIsTrailAllRegion(Boolean isTrailAllRegion) {
        this.isTrailAllRegion = isTrailAllRegion;
        return this;
    }
    public Boolean getIsTrailAllRegion() {
        return this.isTrailAllRegion;
    }

    public PutDataEventSelectorRequest setTrailName(String trailName) {
        this.trailName = trailName;
        return this;
    }
    public String getTrailName() {
        return this.trailName;
    }

    public PutDataEventSelectorRequest setTrailRegionIds(String trailRegionIds) {
        this.trailRegionIds = trailRegionIds;
        return this;
    }
    public String getTrailRegionIds() {
        return this.trailRegionIds;
    }

}
