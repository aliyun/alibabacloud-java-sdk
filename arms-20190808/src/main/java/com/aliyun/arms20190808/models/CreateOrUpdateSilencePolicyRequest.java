// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSilencePolicyRequest extends TeaModel {
    /**
     * <p>The ID of the silence policy.</p>
     * <br>
     * <p>*   If you do not configure this parameter, a new silence policy is created.</p>
     * <p>*   If you configure this parameter, the specified silence policy is modified.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The matching rules. The following code shows the format of matching rules:</p>
     * <br>
     * <p>    [</p>
     * <p>         {</p>
     * <p>    	 "matchingConditions": [</p>
     * <p>    	 {</p>
     * <p>    	 "value": "test", // The value of the matching condition. </p>
     * <p>    	 "key": "altertname", // The key of the matching condition. </p>
     * <p>    	 "operator": "eq" // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   </p>
     * <p>    	 }</p>
     * <p>    	 ]</p>
     * <p>         }</p>
     * <p>    	 ]</p>
     */
    @NameInMap("MatchingRules")
    public String matchingRules;

    /**
     * <p>The name of the silence policy.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

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

}
