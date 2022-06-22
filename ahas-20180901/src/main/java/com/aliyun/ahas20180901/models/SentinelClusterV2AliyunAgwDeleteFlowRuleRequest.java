// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwDeleteFlowRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelClusterV2AliyunAgwDeleteFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwDeleteFlowRuleRequest self = new SentinelClusterV2AliyunAgwDeleteFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwDeleteFlowRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelClusterV2AliyunAgwDeleteFlowRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelClusterV2AliyunAgwDeleteFlowRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
