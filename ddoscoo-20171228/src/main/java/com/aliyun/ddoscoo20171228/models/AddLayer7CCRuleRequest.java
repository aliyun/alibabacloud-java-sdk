// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class AddLayer7CCRuleRequest extends TeaModel {
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

    public static AddLayer7CCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLayer7CCRuleRequest self = new AddLayer7CCRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddLayer7CCRuleRequest setAct(String act) {
        this.act = act;
        return this;
    }
    public String getAct() {
        return this.act;
    }

    public AddLayer7CCRuleRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public AddLayer7CCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddLayer7CCRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddLayer7CCRuleRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AddLayer7CCRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddLayer7CCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddLayer7CCRuleRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public AddLayer7CCRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
