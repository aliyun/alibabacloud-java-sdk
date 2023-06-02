// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCRuleRequest extends TeaModel {
    @NameInMap("Act")
    public String act;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("Uri")
    public String uri;

    public static ModifyWebCCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCCRuleRequest self = new ModifyWebCCRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebCCRuleRequest setAct(String act) {
        this.act = act;
        return this;
    }
    public String getAct() {
        return this.act;
    }

    public ModifyWebCCRuleRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ModifyWebCCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebCCRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public ModifyWebCCRuleRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyWebCCRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyWebCCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWebCCRuleRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public ModifyWebCCRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
