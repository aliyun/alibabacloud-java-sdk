// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EnableSentinelMeshEnvoyRlsRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    public static EnableSentinelMeshEnvoyRlsRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSentinelMeshEnvoyRlsRuleRequest self = new EnableSentinelMeshEnvoyRlsRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableSentinelMeshEnvoyRlsRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public EnableSentinelMeshEnvoyRlsRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EnableSentinelMeshEnvoyRlsRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
