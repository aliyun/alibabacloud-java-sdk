// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSilencePolicyRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("State")
    public String state;

    public static CreateOrUpdateSilencePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSilencePolicyRequest self = new CreateOrUpdateSilencePolicyRequest();
        return TeaModel.build(map, self);
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

}
