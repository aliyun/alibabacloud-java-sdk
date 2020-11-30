// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer7RuleRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("RsType")
    @Validation(required = true)
    public Integer rsType;

    @NameInMap("Rules")
    @Validation(required = true)
    public String rules;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static CreateLayer7RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer7RuleRequest self = new CreateLayer7RuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayer7RuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLayer7RuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateLayer7RuleRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public CreateLayer7RuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public CreateLayer7RuleRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
