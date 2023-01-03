// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSilencePolicyRequest extends TeaModel {
    // The ID of the silence policy.
    // 
    // *   If you do not specify this parameter, a new silence policy is created.
    // *   If you specify this parameter, the specified silence policy is modified.
    @NameInMap("Id")
    public Long id;

    // The matching rules. Sample statement:
    // 
    // ```
    // 
    // [
    //      {
    // 	 "matchingConditions": [
    // 	 {
    // 	 "value": "test", // The value of the matching condition. 
    // 	 "key": "altertname", // The key of the matching condition. 
    // 	 "operator": "eq" // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   
    // 	 }
    // 	 ]
    //      }
    // 	 ]
    // ```
    @NameInMap("MatchingRules")
    public String matchingRules;

    // The name of the silence policy.
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
