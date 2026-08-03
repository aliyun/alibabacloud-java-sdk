// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class PutDataEventSelectorRequest extends TeaModel {
    /**
     * <p>The configuration of the data event selector. This parameter is a JSON array that can contain a maximum of 20 elements.</p>
     * <p>Each element in the JSON array includes the following fields:</p>
     * <ul>
     * <li><p><code>ServiceName</code>: The name of the Alibaba Cloud service that supports data events.</p>
     * </li>
     * <li><p><code>ReadWriteType</code>: The type of data event. Valid values: Read, Write, and All.</p>
     * </li>
     * <li><p><code>EventName</code>: This field contains the <code>Equals</code> and <code>NotEquals</code> subfields.</p>
     * <p>For example, the following configuration specifies that only <code>GetObject</code>, <code>CopyObject</code>, and <code>AppendObject</code>events are delivered:</p>
     * <p><code>{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]}}</code></p>
     * <p>If you specify <code>NotEquals</code>, events other than <code>GetObject</code>, <code>CopyObject</code>, and <code>AppendObject</code> are delivered.</p>
     * </li>
     * <li><p><code>ResourceArn</code>: This field also contains the <code>Equals</code> and <code>NotEquals</code> subfields, similar to <code>EventName</code>. For example:</p>
     * <p><code>{&quot;ResourceArn&quot;:{&quot;Equals&quot;:[arn1,...,arnx]}}</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]},&quot;ReadWriteType&quot;:&quot;All&quot;,&quot;ServiceName&quot;:&quot;Oss&quot;}]</p>
     */
    @NameInMap("EventSelectors")
    public String eventSelectors;

    /**
     * <p>Specifies whether the trail tracks data events in all regions.</p>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTrailAllRegion")
    public Boolean isTrailAllRegion;

    /**
     * <p>The name of the trail.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-name</p>
     */
    @NameInMap("TrailName")
    public String trailName;

    /**
     * <p>The regions where the trail tracks data events. Separate multiple region IDs with a comma (<code>,</code>).</p>
     * 
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
