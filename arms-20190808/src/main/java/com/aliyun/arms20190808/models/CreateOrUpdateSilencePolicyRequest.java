// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSilencePolicyRequest extends TeaModel {
    // 静默策略ID
    @NameInMap("Id")
    public Long id;

    // 分派规则
    @NameInMap("MatchingRules")
    public String matchingRules;

    // 静默策略名称
    @NameInMap("Name")
    public String name;

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

}
