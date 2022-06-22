// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleOffRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelFlowRuleOffRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleOffRequest self = new SentinelFlowRuleOffRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleOffRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFlowRuleOffRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelFlowRuleOffRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
