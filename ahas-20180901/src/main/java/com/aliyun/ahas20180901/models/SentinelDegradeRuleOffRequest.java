// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleOffRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelDegradeRuleOffRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleOffRequest self = new SentinelDegradeRuleOffRequest();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleOffRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelDegradeRuleOffRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelDegradeRuleOffRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
