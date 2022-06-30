// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebRuleRequest extends TeaModel {
    @NameInMap("DefenseId")
    public String defenseId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("HttpsExt")
    public String httpsExt;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RsType")
    public Integer rsType;

    @NameInMap("Rules")
    public String rules;

    public static CreateWebRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebRuleRequest self = new CreateWebRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebRuleRequest setDefenseId(String defenseId) {
        this.defenseId = defenseId;
        return this;
    }
    public String getDefenseId() {
        return this.defenseId;
    }

    public CreateWebRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateWebRuleRequest setHttpsExt(String httpsExt) {
        this.httpsExt = httpsExt;
        return this;
    }
    public String getHttpsExt() {
        return this.httpsExt;
    }

    public CreateWebRuleRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateWebRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateWebRuleRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public CreateWebRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
