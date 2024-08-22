// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSilencePolicyRequest extends TeaModel {
    /**
     * <p>The effective duration of the silence policy. Valid values: PERMANENT, CUSTOM_TIME, and CYCLE_EFFECT.</p>
     * 
     * <strong>example:</strong>
     * <p>PERMANENT</p>
     */
    @NameInMap("EffectiveTimeType")
    public String effectiveTimeType;

    /**
     * <p>The ID of the silence policy.</p>
     * <ul>
     * <li>If you do not configure this parameter, a new silence policy is created.</li>
     * <li>If you configure this parameter, the specified silence policy is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The matching rules. The following code shows the format of matching rules:</p>
     * <pre><code>[
     *      {
     *      &quot;matchingConditions&quot;: [
     *      {
     *      &quot;value&quot;: &quot;test&quot;, // The value of the matching condition. 
     *      &quot;key&quot;: &quot;altertname&quot;, // The key of the matching condition. 
     *      &quot;operator&quot;: &quot;eq&quot; // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   
     *      }
     *      ]
     *      }
     *      ]
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>[ 	 { 	 &quot;matchingConditions&quot;: [ 	 { 	 &quot;value&quot;: &quot;test&quot;, 	 &quot;key&quot;: &quot;altertname&quot;, 	 &quot;operator&quot;: &quot;eq&quot; 	 } 	 ]      } 	 ]</p>
     */
    @NameInMap("MatchingRules")
    public String matchingRules;

    /**
     * <p>The name of the silence policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>silencepolicy_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable the silence policy. Valid values: enable and disable.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The recurring period. This parameter is required when EffectiveTimeType is set to CYCLE_EFFECT. DAY: The silence policy is effective by day. WEEK: The silence policy is effective by week.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("TimePeriod")
    public String timePeriod;

    /**
     * <p>The time period during which the silence policy is effective. If you set EffectiveTimeType to CUSTOM_TIME, specify a custom time period in the following format: [{&quot;startTime&quot;:&quot;2024-08-04 22:13&quot;,&quot;endTime&quot;:&quot;2024-08-04 22:21&quot;}] If you set EffectiveTimeType to CYCLE_EFFECT and TimePeriod to DAY, specify a custom time period in the following format: [{&quot;startTime&quot;:&quot;22:13&quot;,&quot;endTime&quot;:&quot;22:21&quot;}]. The start time cannot be later than the end time. If you set EffectiveTimeType to CYCLE_EFFECT and TimePeriod to WEEK, specify a custom time period in the following format: [{&quot;startWeek&quot;:&quot;1&quot;, &quot;endWeek&quot;:&quot;2&quot; &quot;startTime&quot;:&quot;22:13&quot;,&quot;endTime&quot;:&quot;22:21&quot;}]. Valid values of startWeek and endWeek: 1 to 7. The start time cannot be later than the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;startTime&quot;:&quot;2024-08-04 22:13&quot;,&quot;endTime&quot;:&quot;2024-08-04 22:21&quot;}]</p>
     */
    @NameInMap("TimeSlots")
    public String timeSlots;

    public static CreateOrUpdateSilencePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSilencePolicyRequest self = new CreateOrUpdateSilencePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSilencePolicyRequest setEffectiveTimeType(String effectiveTimeType) {
        this.effectiveTimeType = effectiveTimeType;
        return this;
    }
    public String getEffectiveTimeType() {
        return this.effectiveTimeType;
    }

    public CreateOrUpdateSilencePolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateSilencePolicyRequest setMatchingRules(String matchingRules) {
        this.matchingRules = matchingRules;
        return this;
    }
    public String getMatchingRules() {
        return this.matchingRules;
    }

    public CreateOrUpdateSilencePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateSilencePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrUpdateSilencePolicyRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateOrUpdateSilencePolicyRequest setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }
    public String getTimePeriod() {
        return this.timePeriod;
    }

    public CreateOrUpdateSilencePolicyRequest setTimeSlots(String timeSlots) {
        this.timeSlots = timeSlots;
        return this;
    }
    public String getTimeSlots() {
        return this.timeSlots;
    }

}
